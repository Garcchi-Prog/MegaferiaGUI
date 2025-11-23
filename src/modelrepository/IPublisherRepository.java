/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Publisher;

public interface IPublisherRepository {

    public abstract void guardar(Publisher publisher);

    public abstract ArrayList<Publisher> obtenerTodos();

    public abstract Publisher buscarPorNit(String nit);
}
