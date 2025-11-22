/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Manager;

public interface IManagerRepository {
    
    void guardar(Manager manager);
    
    ArrayList<Manager> obtenerTodos();
}
