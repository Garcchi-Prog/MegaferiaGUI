/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelrepository;

import java.util.ArrayList;
import model.Author;

public interface IAuthorRepository {

    public abstract void guardar(Author author);

    public abstract ArrayList<Author> obtenerTodos();

    public abstract Author buscarPorId(long id);
}
