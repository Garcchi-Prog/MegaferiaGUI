/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Stand;

public interface IStandRepository {

    public abstract void guardar(Stand stand);

    public abstract ArrayList<Stand> obtenerTodos();
    
}
