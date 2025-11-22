/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.IPublisherRepository;
import model.Publisher;
import java.util.ArrayList;

public class PublisherRepositoryImpl implements IPublisherRepository {
    
    private ArrayList<Publisher> listaEditoriales;

    public PublisherRepositoryImpl() {
        this.listaEditoriales = new ArrayList<>();
    }

    @Override
    public void guardar(Publisher publisher) {
        this.listaEditoriales.add(publisher);
    }

    @Override
    public ArrayList<Publisher> obtenerTodos() {
        return this.listaEditoriales;
    }

    @Override
    public Publisher buscarPorNit(String nit) {
        for (Publisher p : listaEditoriales) {
            if (p.getNit().equals(nit)) {
                return p;
            }
        }
        return null;
    }
}
