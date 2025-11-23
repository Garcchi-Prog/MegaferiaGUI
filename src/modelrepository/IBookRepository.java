/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository;

import java.util.ArrayList;
import model.Book;

public interface IBookRepository {

    public abstract void guardar(Book book);

    public abstract ArrayList<Book> obtenerTodos();
}
