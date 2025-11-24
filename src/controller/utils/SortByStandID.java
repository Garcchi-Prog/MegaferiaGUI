/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.utils;

import java.util.Comparator;
import model.Stand;

/**
 *
 * @author aesme
 */
public class SortByStandID implements Comparator<Stand>{

    @Override
    public int compare(Stand stand1, Stand stand2) {
        return (int) (stand1.getId() - stand2.getId());
    }
    
}
