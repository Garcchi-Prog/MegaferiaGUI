package controller;

import controller.utils.Response;
import controller.utils.Status;
import java.util.ArrayList;

import model.Megaferia;
import model.Stand;
import model.Author;
import model.Manager;
import model.Narrator;
import model.Publisher;
import model.Book;
import model.PrintedBook;
import model.Audiobook;
import model.DigitalBook;

import modelrepository.IStandRepository;
import modelrepository.IAuthorRepository;
import modelrepository.IManagerRepository;
import modelrepository.INarratorRepository;
import modelrepository.IPublisherRepository;
import modelrepository.IBookRepository;

public class ProgramController {

    public static Response createStand(String idStr, String priceStr) {
        try {
            if (idStr.length() > 15) {
                return new Response("El ID debe tener máx. 15 dígitos", Status.BAD_REQUEST);
            }

            long id = Long.parseLong(idStr);
            double price = Double.parseDouble(priceStr);

            if (id < 0) {
                return new Response("El ID debe ser mayor o igual a 0", Status.BAD_REQUEST);
            }
            if (price <= 0) {
                return new Response("El precio debe ser superior a 0", Status.BAD_REQUEST);
            }

            IStandRepository repo = Megaferia.getInstance().getStandRepository();

            for (Stand stand : repo.obtenerTodos()) {
                if (stand.getId() == id) {
                    return new Response("El ID del Stand ya existe", Status.BAD_REQUEST);
                }
            }

            Stand newStand = new Stand(id, price);
            repo.guardar(newStand);

            return new Response("Stand creado exitosamente", Status.CREATED, newStand);

        } catch (NumberFormatException e) {
            return new Response("El ID y Precio deben ser números válidos", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerAuthor(String idStr, String firstname, String lastname) {
        try {
            if (firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
                return new Response("Los campos no deben estar vacíos", Status.BAD_REQUEST);
            }
            if (idStr.length() > 15) {
                return new Response("El ID debe tener máx. 15 dígitos", Status.BAD_REQUEST);
            }

            long id = Long.parseLong(idStr);
            if (id < 0) {
                return new Response("El ID debe ser mayor o igual a 0", Status.BAD_REQUEST);
            }

            IAuthorRepository repo = Megaferia.getInstance().getAuthorRepository();

            for (Author author : repo.obtenerTodos()) {
                if (author.getId() == id) {
                    return new Response("El ID del autor ya existe", Status.BAD_REQUEST);
                }
            }

            Author newAuthor = new Author(id, firstname, lastname);
            repo.guardar(newAuthor);

            return new Response("Autor registrado exitosamente", Status.CREATED, newAuthor);

        } catch (NumberFormatException e) {
            return new Response("El ID debe ser numérico", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerManager(String idStr, String firstname, String lastname) {
        try {
            if (firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
                return new Response("Los campos no deben estar vacíos", Status.BAD_REQUEST);
            }
            if (idStr.length() > 15) {
                return new Response("El ID debe tener máx. 15 dígitos", Status.BAD_REQUEST);
            }

            long id = Long.parseLong(idStr);
            if (id < 0) {
                return new Response("El ID debe ser mayor o igual a 0", Status.BAD_REQUEST);
            }

            IManagerRepository repo = Megaferia.getInstance().getManagerRepository();

            for (Manager manager : repo.obtenerTodos()) {
                if (manager.getId() == id) {
                    return new Response("El ID del gerente ya existe", Status.BAD_REQUEST);
                }
            }

            Manager newManager = new Manager(id, firstname, lastname);
            repo.guardar(newManager);

            return new Response("Gerente registrado exitosamente", Status.CREATED, newManager);

        } catch (NumberFormatException e) {
            return new Response("El ID debe ser numérico", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerNarrator(String idStr, String firstname, String lastname) {
        try {
            if (firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
                return new Response("Los campos no deben estar vacíos", Status.BAD_REQUEST);
            }
            if (idStr.length() > 15) {
                return new Response("El ID debe tener máx. 15 dígitos", Status.BAD_REQUEST);
            }

            long id = Long.parseLong(idStr);
            if (id < 0) {
                return new Response("El ID debe ser mayor o igual a 0", Status.BAD_REQUEST);
            }

            INarratorRepository repo = Megaferia.getInstance().getNarratorRepository();

            for (Narrator narrator : repo.obtenerTodos()) {
                if (narrator.getId() == id) {
                    return new Response("El ID del narrador ya existe", Status.BAD_REQUEST);
                }
            }

            Narrator newNarrator = new Narrator(id, firstname, lastname);
            repo.guardar(newNarrator);

            return new Response("Narrador registrado exitosamente", Status.CREATED, newNarrator);

        } catch (NumberFormatException e) {
            return new Response("El ID debe ser numérico", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerPublisher(String nit, String name, String address, String managerData) {
        try {
            if (nit.trim().isEmpty() || name.trim().isEmpty() || address.trim().isEmpty() || managerData == null) {
                return new Response("Los campos no deben estar vacíos", Status.BAD_REQUEST);
            }

            boolean formatoValido = true;
            if (nit.length() != 13) {
                formatoValido = false;
            } else {
                if (nit.charAt(3) != '.' || nit.charAt(7) != '.' || nit.charAt(11) != '-') {
                    formatoValido = false;
                } else {
                    String onlyDigits = nit.substring(0, 3) + nit.substring(4, 7) + nit.substring(8, 11) + nit.substring(12);
                    if (!onlyDigits.matches("\\d+")) {
                        formatoValido = false;
                    }
                }
            }

            if (!formatoValido) {
                return new Response("El NIT debe tener formato XXX.XXX.XXX-X", Status.BAD_REQUEST);
            }

            IPublisherRepository pubRepo = Megaferia.getInstance().getPublisherRepository();
            for (Publisher publisher : pubRepo.obtenerTodos()) {
                if (publisher.getNit().equals(nit)) {
                    return new Response("El NIT de la editorial ya existe", Status.BAD_REQUEST);
                }
            }

            long managerId = Long.parseLong(managerData.split(" - ")[0]);
            Manager selectedManager = null;

            IManagerRepository mgrRepo = Megaferia.getInstance().getManagerRepository();
            for (Manager manager : mgrRepo.obtenerTodos()) {
                if (manager.getId() == managerId) {
                    selectedManager = manager;
                    break;
                }
            }

            if (selectedManager == null) {
                return new Response("El Gerente seleccionado no existe", Status.BAD_REQUEST);
            }

            Publisher newPublisher = new Publisher(nit, name, address, selectedManager);
            pubRepo.guardar(newPublisher);

            return new Response("Editorial registrada exitosamente", Status.CREATED, newPublisher);

        } catch (NumberFormatException e) {
            return new Response("Error al procesar el ID del Gerente.", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerBook(String title, String authorsContent, String bn, String genre, String format, String valueStr, String publisherData, boolean printed, String pagesStr, String copiesStr, boolean digital, String hyperlink, boolean audiobook, String durationStr, String narratorData) {
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

            String publisherNit = publisherData.split(" ")[1].replace("(", "").replace(")", "");
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

    public static Response addStandToBuy(String standSeleccionado, String contenidoActualTextArea) {
        if (standSeleccionado == null || standSeleccionado.isEmpty()) {
            return new Response("Debe seleccionar un Stand", Status.BAD_REQUEST);
        }

        String[] lineas = contenidoActualTextArea.split("\n");
        for (String linea : lineas) {
            if (linea.trim().equals(standSeleccionado)) {
                return new Response("El Stand ya está en la lista", Status.BAD_REQUEST);
            }
        }

        String nuevoContenido = contenidoActualTextArea.isEmpty() ? standSeleccionado : contenidoActualTextArea + "\n" + standSeleccionado;
        return new Response("Stand agregado", Status.OK, nuevoContenido);
    }

    public static Response deleteStandFromBuy(String standAEliminar, String contenidoActualTextArea) {
        if (standAEliminar == null || standAEliminar.isEmpty()) {
            return new Response("Debe seleccionar un Stand de la lista para eliminar", Status.BAD_REQUEST);
        }

        String nuevoContenido = "";
        String[] lineas = contenidoActualTextArea.split("\n");

        for (String linea : lineas) {
            if (!linea.trim().equals(standAEliminar) && !linea.trim().isEmpty()) {
                if (nuevoContenido.isEmpty()) {
                    nuevoContenido = linea;
                } else {
                    nuevoContenido += "\n" + linea;
                }
            }
        }
        return new Response("Stand eliminado", Status.OK, nuevoContenido);
    }

    public static Response addPublisherToBuy(String editorialSeleccionada, String contenidoActualTextArea) {
        if (editorialSeleccionada == null || editorialSeleccionada.isEmpty()) {
            return new Response("Debe seleccionar una Editorial", Status.BAD_REQUEST);
        }

        String[] lineas = contenidoActualTextArea.split("\n");
        for (String linea : lineas) {
            if (linea.trim().equals(editorialSeleccionada)) {
                return new Response("La Editorial ya está en la lista", Status.BAD_REQUEST);
            }
        }

        String nuevoContenido = contenidoActualTextArea.isEmpty() ? editorialSeleccionada : contenidoActualTextArea + "\n" + editorialSeleccionada;
        return new Response("Editorial agregada", Status.OK, nuevoContenido);
    }

    public static Response deletePublisherFromBuy(String editorialAEliminar, String contenidoActualTextArea) {
        if (editorialAEliminar == null || editorialAEliminar.isEmpty()) {
            return new Response("Debe seleccionar una Editorial de la lista para eliminar", Status.BAD_REQUEST);
        }

        String nuevoContenido = "";
        String[] lineas = contenidoActualTextArea.split("\n");

        for (String linea : lineas) {
            if (!linea.trim().equals(editorialAEliminar) && !linea.trim().isEmpty()) {
                if (nuevoContenido.isEmpty()) {
                    nuevoContenido = linea;
                } else {
                    nuevoContenido += "\n" + linea;
                }
            }
        }
        return new Response("Editorial eliminada", Status.OK, nuevoContenido);
    }

    public static Response buyStand(String standsContent, String publishersContent) {
        try {
            if (standsContent.trim().isEmpty() || publishersContent.trim().isEmpty()) {
                return new Response("Debe seleccionar al menos un Stand y una Editorial", Status.BAD_REQUEST);
            }

            ArrayList<Stand> standsAComprar = new ArrayList<>();
            String[] standLines = standsContent.split("\n");
            IStandRepository standRepo = Megaferia.getInstance().getStandRepository();

            for (String linea : standLines) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                long idStand = Long.parseLong(linea.trim());

                boolean encontrado = false;
                for (Stand s : standRepo.obtenerTodos()) {
                    if (s.getId() == idStand) {
                        standsAComprar.add(s);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    return new Response("El Stand con ID " + idStand + " no existe", Status.BAD_REQUEST);
                }
            }

            ArrayList<Publisher> editorialesCompradoras = new ArrayList<>();
            String[] pubLines = publishersContent.split("\n");
            IPublisherRepository pubRepo = Megaferia.getInstance().getPublisherRepository();

            for (String linea : pubLines) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                String nit = linea.split(" ")[1].replace("(", "").replace(")", "");

                boolean encontrado = false;
                for (Publisher p : pubRepo.obtenerTodos()) {
                    if (p.getNit().equals(nit)) {
                        editorialesCompradoras.add(p);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    return new Response("La editorial con NIT " + nit + " no existe", Status.BAD_REQUEST);
                }
            }

            for (Stand s : standsAComprar) {
                for (Publisher p : editorialesCompradoras) {
                    boolean yaTiene = false;
                    for (Publisher existingPub : s.getPublishers()) {
                        if (existingPub.getNit().equals(p.getNit())) {
                            yaTiene = true;
                            break;
                        }
                    }

                    if (!yaTiene) {
                        s.addPublisher(p);
                        p.addStand(s);
                    }
                }
            }

            return new Response("Compra de Stands realizada con éxito", Status.OK);

        } catch (Exception e) {
            return new Response("Error al procesar la compra", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static ArrayList<Object[]> getPublisherData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getPersonData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getStandData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getBookData(String searchCriteria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> obtenerLibrosPorAutor(String autorData) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> obtenerLibrosPorFormato(String searchFormat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> obtenerAutoresConMasLibros() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> obtenerNombresEditoriales() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
