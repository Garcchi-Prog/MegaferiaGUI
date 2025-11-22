/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Author;

public interface IAuthorRepository {
    void guardar(Author author);
    ArrayList<Author> obtenerTodos();
    Author buscarPorId(long id);
}
