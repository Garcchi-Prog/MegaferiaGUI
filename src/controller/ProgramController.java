package controller;

import controller.utils.Response;
import controller.utils.SortByID;
import controller.utils.Status;
import java.util.ArrayList;
import java.util.Collections;

import model.Megaferia;
import model.Author;
import model.Manager;
import model.Narrator;
import model.Person;

import modelrepository.IAuthorRepository;
import modelrepository.IManagerRepository;
import modelrepository.INarratorRepository;

public class ProgramController {

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
   
    

    public static ArrayList<Person> getPersonData() {
        INarratorRepository narRepo = Megaferia.getInstance().getNarratorRepository();
        IAuthorRepository auRepo = Megaferia.getInstance().getAuthorRepository();
        IManagerRepository manRepo = Megaferia.getInstance().getManagerRepository();
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.addAll(narRepo.obtenerTodos());
        persons.addAll(auRepo.obtenerTodos());
        persons.addAll(manRepo.obtenerTodos());
        
        Collections.sort(persons, new SortByID());
        return persons;
    }

    

   

    public static ArrayList<Object[]> getBooksByAuthor(String autorData) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getBooksByFormat(String searchFormat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getAuthorsMostBooks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getPublisherNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static Response addAuthorToBook(String autorSeleccionado, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response DeleteAuthorFromBook(String autorEliminar, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
