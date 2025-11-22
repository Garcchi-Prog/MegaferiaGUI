/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.IAuthorRepository;
import model.Author;
import java.util.ArrayList;

public class AuthorRepositoryImpl implements IAuthorRepository {
    
    private ArrayList<Author> listaAutores;

    public AuthorRepositoryImpl() {
        this.listaAutores = new ArrayList<>();
    }

    @Override
    public void guardar(Author author) {
        this.listaAutores.add(author);
    }

    @Override
    public ArrayList<Author> obtenerTodos() {
        return this.listaAutores;
    }

    @Override
    public Author buscarPorId(long id) {
        for (Author autor : listaAutores) {
            if (autor.getId() == id) {
                return autor;
            }
        }
        return null;
    }
}