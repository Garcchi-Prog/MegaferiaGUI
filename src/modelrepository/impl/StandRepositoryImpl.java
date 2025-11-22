/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.IStandRepository;
import model.Stand;
import java.util.ArrayList;

public class StandRepositoryImpl implements IStandRepository {
    
    private ArrayList<Stand> listaStands;

    public StandRepositoryImpl() {
        this.listaStands = new ArrayList<>();
    }

    @Override
    public void guardar(Stand stand) {
        this.listaStands.add(stand);
    }

    @Override
    public ArrayList<Stand> obtenerTodos() {
        return this.listaStands;
    }
}