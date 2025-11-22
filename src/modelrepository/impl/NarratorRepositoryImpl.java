/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.INarratorRepository;
import model.Narrator;
import java.util.ArrayList;

public class NarratorRepositoryImpl implements INarratorRepository {
    
    private ArrayList<Narrator> narrators;

    public NarratorRepositoryImpl() {
        this.narrators = new ArrayList<>();
    }

    @Override
    public void guardar(Narrator narrator) {
        this.narrators.add(narrator);
    }

    @Override
    public ArrayList<Narrator> obtenerTodos() {
        return this.narrators;
    }
}