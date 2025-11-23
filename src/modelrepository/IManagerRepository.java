/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Manager;

public interface IManagerRepository {

    public abstract void guardar(Manager manager);

    public abstract ArrayList<Manager> obtenerTodos();
}
