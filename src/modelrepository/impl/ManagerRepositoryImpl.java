/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelrepository.impl;

import modelrepository.IManagerRepository;
import model.Manager;
import java.util.ArrayList;

public class ManagerRepositoryImpl implements IManagerRepository {
    
    private ArrayList<Manager> managers;

    public ManagerRepositoryImpl() {
        this.managers = new ArrayList<>();
    }

    @Override
    public void guardar(Manager manager) {
        this.managers.add(manager);
    }

    @Override
    public ArrayList<Manager> obtenerTodos() {
        return this.managers;
    }
}
