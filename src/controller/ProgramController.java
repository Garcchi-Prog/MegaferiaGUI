package controller;

import controller.utils.Response;
import controller.utils.Status;
import java.util.ArrayList;
import model.Megaferia;
import model.Stand;

public class ProgramController {

public static Response createStand(String idStr, String priceStr) {
        try {
            long id = Long.parseLong(idStr);
            double price = Double.parseDouble(priceStr);

            if (price <= 0) {
                return new Response("El precio debe ser mayor a 0", Status.BAD_REQUEST);
            }
            
            Megaferia db = Megaferia.getInstance();
            for (Stand s : db.getStands()) {
                if (s.getId() == id) {
                     return new Response("El ID del Stand ya existe", Status.BAD_REQUEST);
                }
            }

            Stand newStand = new Stand(id, price);

            db.addStand(newStand);

            return new Response("Stand creado exitosamente", Status.CREATED, newStand);

        } catch (NumberFormatException e) {
            return new Response("El ID y Precio deben ser números válidos", Status.BAD_REQUEST);
        } catch (Exception e) {
            return new Response("Error interno", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response registerAuthor(String id, String firstname, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response registerManager(String id, String firstname, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response registerNarrator(String id, String firstname, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response registerPublisher(String nit, String name, String address, String managerData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response addAuthorToBook(String autorSeleccionado, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response DeleteAuthorFromBook(String autorEliminar, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response registerBook(String title, String authorsContent, String bn, String genre, String format, String valueStr, String publisherData, boolean printed, String pagesStr, String copiesStr, boolean digital, String hyperlink, boolean audiobook, String durationStr, String narratorData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response addStandToBuy(String standSeleccionado, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response deleteStandFromBuy(String standAEliminar, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response addPublisherToBuy(String editorialSeleccionada, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response deletePublisherFromBuy(String editorialAEliminar, String contenidoActualTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Response buyStand(String standsContent, String publishersContent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    //Por ahora no hagas nada desde aca 
    public static ArrayList<Object[]> getPublisherData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> getPersonData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> getStandData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> getBookData(String searchCriteria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> obtenerLibrosPorAutor(String autorData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> obtenerLibrosPorFormato(String searchFormat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Object[]> obtenerAutoresConMasLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<String> obtenerNombresEditoriales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
