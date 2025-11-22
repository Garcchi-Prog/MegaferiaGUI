/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.IBookRepository;
import model.Book;
import java.util.ArrayList;

public class BookRepositoryImpl implements IBookRepository {
    
    private ArrayList<Book> books;

    public BookRepositoryImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public void guardar(Book book) {
        this.books.add(book);
    }

    @Override
    public ArrayList<Book> obtenerTodos() {
        return this.books;
    }
}
