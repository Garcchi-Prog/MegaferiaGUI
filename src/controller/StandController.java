/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.utils.SortByStandID;
import controller.utils.Response;
import controller.utils.Status;
import java.util.ArrayList;
import java.util.Collections;
import model.Megaferia;
import model.Publisher;
import model.Stand;
import modelrepository.IPublisherRepository;
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

    public static Response addToBuy(String stand, String contenido) {
        try {
            if (stand.trim().isEmpty() || stand.trim().equals("Seleccione uno...")) {
                return new Response("Seleccione un stand.", Status.BAD_REQUEST);
            }

            if (contenido.trim().contains(stand)) {
                return new Response("Ese stand ya fue agregado.", Status.BAD_REQUEST);
            }

            return new Response("Stand añadido exitosamente.", Status.OK);
        } catch (Exception e) {
            return new Response("Error interno del sistema", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Response deleteFromBuy(String stand, String contenido) {
        try {
            if (stand.trim().isEmpty() || stand.trim().equals("Seleccione uno...")) {
                return new Response("Debe seleccionar un stand.", Status.BAD_REQUEST);
            }

            if (!contenido.trim().contains(stand.trim())) {
                return new Response("Ese stand no ha sido añadido.", Status.BAD_REQUEST);
            }

            String idAEliminar = stand.split(" - ")[0]; 
            String[] lineas = contenido.split("\n");
            String nuevoContenido = "";

            for (String linea : lineas) {
                String idLinea = linea.split(" - ")[0]; 
                if (!idLinea.trim().equals(idAEliminar.trim())) {
                    if (!nuevoContenido.isEmpty()) {
                        nuevoContenido += "\n";
                    }
                    nuevoContenido += linea;
                }
            }

            return new Response( "Stand eliminado correctamente", Status.OK);

        } catch (Exception e) {
            return new Response("Error interno: " + e.getMessage(), Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Response buy(String standsContent, String publishersContent) {
        try {
            if (standsContent.trim().isEmpty() || publishersContent.trim().isEmpty()) {
                return new Response("Agrege al menos un stand y una editorial.", Status.BAD_REQUEST);
            }

            IPublisherRepository pubRepo = Megaferia.getInstance().getPublisherRepository();
            IStandRepository standRepo = Megaferia.getInstance().getStandRepository();
            ArrayList<Stand> stands = standRepo.obtenerTodos();

            String[] nuevosStands = standsContent.split("\n");
            String[] nuevosPublishers = publishersContent.split("\n");
            Stand standComprado = null;

            for (String nuevoStand : nuevosStands) {
                String[] temp = nuevoStand.split(" - $");

                for (Stand stand : stands) {
                    if (stand.getId() == Long.parseLong(temp[0])) {
                        standComprado = stand;
                        break;
                    }
                }

                for (String publisher : nuevosPublishers) {
                    String[] tempId = publisher.split(" - ");
                    Publisher tempPub = pubRepo.buscarPorNit(tempId[0]);

                    if (tempPub.getStands().contains(standComprado)) {
                        return new Response("Uno o más stands ya le pertenecen a una de estas editoriales.", Status.BAD_REQUEST);
                    }
                }

            }

            for (String nuevoStand : nuevosStands) {
                String[] temp = nuevoStand.split(" - $");

                for (String publisher : nuevosPublishers) {
                    String[] tempId = publisher.split(" - ");
                    for (Stand stand : stands) {
                        if (stand.getId() == Long.parseLong(temp[0])) {
                            stand.setCompra(true);
                            standComprado = stand;
                            stand.addPublisher(pubRepo.buscarPorNit(tempId[0]));
                            break;
                        }
                    }

                    pubRepo.buscarPorNit(tempId[0]).addStand(standComprado);

                }
            }

            return new Response("Stands comprados exitosamente", Status.OK);
        } catch (Exception e) {
            return new Response("Error interno", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static ArrayList<Stand> getData() {
        IStandRepository standRepo = Megaferia.getInstance().getStandRepository();
        ArrayList<Stand> stands = standRepo.obtenerTodos();

        Collections.sort(stands, new SortByStandID());

        return stands;
    }

}
