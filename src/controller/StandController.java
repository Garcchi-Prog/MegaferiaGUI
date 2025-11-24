/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.utils.Response;
import controller.utils.Status;
import java.util.ArrayList;
import java.util.Collections;
import model.Megaferia;
import model.Stand;
import modelrepository.IStandRepository;

/**
 * @author aesme
 */
public class StandController {

    public static Response create(String idStr, String priceStr) {
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

    public static Response addToBuy(String standSeleccionado, String contenidoActualTextArea) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    public static Response deleteFromBuy(String aEliminar, String contenidoActualTextArea) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public static Response buy(String standsContent, String publishersContent) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public static ArrayList<Stand> getData() {
        IStandRepository standRepo = Megaferia.getInstance().getStandRepository();
        ArrayList<Stand> stands = standRepo.obtenerTodos();
        
        Collections.sort(stands, new SortByStandID());
        
        return stands;
    }

}
