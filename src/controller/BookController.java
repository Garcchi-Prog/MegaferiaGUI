/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.utils.Response;
import controller.utils.SortArrayByISBN;
import controller.utils.SortByISBN;
import controller.utils.Status;
import java.util.ArrayList;
import java.util.Collections;
import model.Audiobook;
import model.Author;
import model.Book;
import model.DigitalBook;
import model.Megaferia;
import model.Narrator;
import model.PrintedBook;
import model.Publisher;
import modelrepository.IAuthorRepository;
import modelrepository.IBookRepository;
import modelrepository.INarratorRepository;
import modelrepository.IPublisherRepository;

/**
 *
 * @author aesme
 */
public class BookController {

    public static Response register(String title, String authorsContent, String authorData, String bn, String genre, String format, String valueStr, String publisherData, boolean printed, String pagesStr, String copiesStr, boolean digital, String hyperlink, boolean audiobook, String durationStr, String narratorData) {
        try {
            if (title.trim().isEmpty() || genre.trim().isEmpty() || format.trim().isEmpty() || valueStr.trim().isEmpty()) {
                return new Response("Los campos generales no deben ser vacíos", Status.BAD_REQUEST);
            }

            double value = Double.parseDouble(valueStr);
            if (value <= 0) {
                return new Response("El valor del libro debe ser mayor a 0", Status.BAD_REQUEST);
            }

            IBookRepository bookRepo = Megaferia.getInstance().getBookRepository();

            String isbn = bn.trim();
            boolean formatoValido = true;
            if (isbn.length() != 17) {
                formatoValido = false;
            } else if (isbn.charAt(3) != '-' || isbn.charAt(5) != '-' || isbn.charAt(8) != '-' || isbn.charAt(15) != '-') {
                formatoValido = false;
            }

            if (!formatoValido) {
                return new Response("El ISBN debe tener formato XXX-X-XX-XXXXXX-X", Status.BAD_REQUEST);
            }

            for (Book book : bookRepo.obtenerTodos()) {
                if (book.getIsbn().equals(isbn)) {
                    return new Response("El ISBN ya pertenece a otro libro", Status.BAD_REQUEST);
                }
            }

            IAuthorRepository authorRepo = Megaferia.getInstance().getAuthorRepository();
            ArrayList<Author> selectedAuthors = new ArrayList<>();
            String[] authorsData = authorsContent.split("\n");
            ArrayList<Long> authorsInBook = new ArrayList<>();

            for (String authorStr : authorsData) {
                if (authorStr.trim().isEmpty()) {
                    continue;
                }

                long authorId = Long.parseLong(authorStr.split(" - ")[0]);

                if (authorsInBook.contains(authorId)) {
                    return new Response("No se pueden repetir autores", Status.BAD_REQUEST);
                }

                Author foundAuthor = null;
                for (Author a : authorRepo.obtenerTodos()) {
                    if (a.getId() == authorId) {
                        foundAuthor = a;
                        break;
                    }
                }
                if (foundAuthor == null) {
                    return new Response("El autor con ID " + authorId + " no existe", Status.BAD_REQUEST);
                }

                selectedAuthors.add(foundAuthor);
                authorsInBook.add(authorId);
            }

            if (selectedAuthors.isEmpty()) {
                return new Response("Debe seleccionar al menos un autor", Status.BAD_REQUEST);
            }

            if (publisherData == null || publisherData.trim().isEmpty()) {
                return new Response("Debe seleccionar una editorial", Status.BAD_REQUEST);
            }

            String publisherNit = publisherData.split(" - ")[0].trim();
            Publisher selectedPublisher = null;
            IPublisherRepository pubRepo = Megaferia.getInstance().getPublisherRepository();

            for (Publisher p : pubRepo.obtenerTodos()) {
                if (p.getNit().equals(publisherNit)) {
                    selectedPublisher = p;
                    break;
                }
            }
            if (selectedPublisher == null) {
                return new Response("La editorial seleccionada no existe", Status.BAD_REQUEST);
            }

            Book newBook = null;

            if (printed) {
                int pages = Integer.parseInt(pagesStr);
                int copies = Integer.parseInt(copiesStr);
                newBook = new PrintedBook(title, selectedAuthors, isbn, genre, format, value, selectedPublisher, pages, copies);
            } else if (digital) {
                newBook = new DigitalBook(title, selectedAuthors, isbn, genre, format, value, selectedPublisher, hyperlink);
            } else if (audiobook) {
                int duration = Integer.parseInt(durationStr);
                if (narratorData == null || narratorData.trim().isEmpty()) {
                    return new Response("Debe seleccionar un narrador", Status.BAD_REQUEST);
                }

                long narratorId = Long.parseLong(narratorData.split(" - ")[0]);
                Narrator selectedNarrator = null;
                INarratorRepository narrRepo = Megaferia.getInstance().getNarratorRepository();

                for (Narrator n : narrRepo.obtenerTodos()) {
                    if (n.getId() == narratorId) {
                        selectedNarrator = n;
                        break;
                    }
                }
                if (selectedNarrator == null) {
                    return new Response("El narrador seleccionado no existe", Status.BAD_REQUEST);
                }

                newBook = new Audiobook(title, selectedAuthors, isbn, genre, format, value, selectedPublisher, duration, selectedNarrator);
            } else {
                return new Response("Debe seleccionar un tipo de libro", Status.BAD_REQUEST);
            }

            bookRepo.guardar(newBook);

            return new Response("Libro registrado exitosamente", Status.CREATED, newBook);

        } catch (NumberFormatException e) {
            return new Response("Revise los campos numéricos", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno: " + e.getMessage(), Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static ArrayList<Book> getData() {
        IBookRepository bookRepo = Megaferia.getInstance().getBookRepository();
        ArrayList<Book> allBooks = bookRepo.obtenerTodos();
        
        Collections.sort(allBooks, new SortByISBN());
        
        return allBooks;
    }

    public static ArrayList<Object[]> getBooksByAuthor(String autorData) {
        if (autorData.trim().equals("Seleccione uno...")) {
            return new ArrayList<>();
        }

        IAuthorRepository auRepo = Megaferia.getInstance().getAuthorRepository();
        Author author = null;
        IBookRepository bookRepo = Megaferia.getInstance().getBookRepository();
        ArrayList<Object[]> books = new ArrayList<>();
        String[] tempData = autorData.split(" - ");
        for (Author tempAuthor : auRepo.obtenerTodos()) {

            if (tempAuthor.getId() == Integer.parseInt(tempData[0])) {
                author = tempAuthor;
            }
        }

        for (Book libro : bookRepo.obtenerTodos()) {
            if (libro.getAuthors().contains(author)) {
                Object[] sendBooks = new Object[12];
                sendBooks[0] = libro.getTitle();
                sendBooks[1] = libro.getAuthors();
                sendBooks[2] = libro.getIsbn();
                sendBooks[3] = libro.getGenre();
                sendBooks[4] = libro.getFormat();
                sendBooks[5] = libro.getValue();
                sendBooks[6] = libro.getPublisher();
                sendBooks[7] = (libro instanceof PrintedBook) ? PrintedBook.class.cast(libro).getCopies() : "";
                sendBooks[8] = (libro instanceof PrintedBook) ? PrintedBook.class.cast(libro).getPages() : "";
                sendBooks[9] = (libro instanceof DigitalBook) ? DigitalBook.class.cast(libro).getHyperlink() : "";
                sendBooks[10] = (libro instanceof Audiobook) ? Audiobook.class.cast(libro).getNarrador() : "";
                sendBooks[11] = (libro instanceof Audiobook) ? Audiobook.class.cast(libro).getDuration() : "";
                books.add(sendBooks);
            }
        }

        Collections.sort(books, new SortArrayByISBN());

        return books;

    }

    public static ArrayList<Object[]> getBooksByFormat(String searchFormat) {
        if (searchFormat.trim().equals("Seleccione uno...")) {
            return new ArrayList<>();
        }
        
        IBookRepository bookRepo = Megaferia.getInstance().getBookRepository();
        ArrayList<Object[]> books = new ArrayList<>();
        
        for (Book libro : bookRepo.obtenerTodos()) {
            if (libro.getFormat().equals(searchFormat)) {
                Object[] sendBooks = new Object[12];
                sendBooks[0] = libro.getTitle();
                sendBooks[1] = libro.getAuthors();
                sendBooks[2] = libro.getIsbn();
                sendBooks[3] = libro.getGenre();
                sendBooks[4] = libro.getFormat();
                sendBooks[5] = libro.getValue();
                sendBooks[6] = libro.getPublisher();
                sendBooks[7] = (libro instanceof PrintedBook) ? PrintedBook.class.cast(libro).getCopies() : "";
                sendBooks[8] = (libro instanceof PrintedBook) ? PrintedBook.class.cast(libro).getPages() : "";
                sendBooks[9] = (libro instanceof DigitalBook) ? DigitalBook.class.cast(libro).getHyperlink() : "";
                sendBooks[10] = (libro instanceof Audiobook) ? Audiobook.class.cast(libro).getNarrador() : "";
                sendBooks[11] = (libro instanceof Audiobook) ? Audiobook.class.cast(libro).getDuration() : "";
                books.add(sendBooks);
            }
        }
        
        Collections.sort(books, new SortArrayByISBN());
        
        return books;
    }

    public static Response addAuthorTo(String autor, String contenido) {
        try {
            if (autor.trim().isEmpty() || autor.trim().equals("Seleccione uno...")) {
                return new Response("Debe seleccionar un autor.", Status.BAD_REQUEST);
            }

            if (contenido.trim().contains(autor.trim())) {
                return new Response("Ese autor ya fue añadido.", Status.BAD_REQUEST);
            }

            return new Response("Autor añadido correctamente", Status.OK);

        } catch (Exception e) {
            return new Response("Error interno: " + e.getMessage(), Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Response deleteFrom(String autor, String contenido) {
        try {
            if (autor.trim().isEmpty() || autor.trim().equals("Seleccione uno...")) {
                return new Response("Debe seleccionar un autor.", Status.BAD_REQUEST);
            }

            if (!contenido.trim().contains(autor.trim())) {
                return new Response("Ese autor no ha sido añadido.", Status.BAD_REQUEST);
            }

            return new Response("Autor eliminado correctamente", Status.OK);

        } catch (Exception e) {
            return new Response("Error interno: " + e.getMessage(), Status.INTERNAL_SERVER_ERROR);
        }
    }

}
