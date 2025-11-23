/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.utils.Response;
import controller.utils.Status;
import java.util.ArrayList;
import model.Manager;
import model.Megaferia;
import model.Publisher;
import modelrepository.IManagerRepository;
import modelrepository.IPublisherRepository;

/**
 *
 * @author aesme
 */
public class PublisherController {

    public static Response register(String nit, String name, String address, String managerData) {
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

    public static Response addToBuy(String editorialSeleccionada, String contenidoActualTextArea) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public static Response deleteFromBuy(String editorialAEliminar, String contenidoActualTextArea) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public static ArrayList<Object[]> getData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static ArrayList<Object[]> getNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
