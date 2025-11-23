/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.utils;

import java.util.Comparator;

/**
 *
 * @author aesme
 */
public class SortArray implements Comparator<Object[]> {

    @Override
    public int compare(Object[] au1, Object[] au2) {
        int id1 = (int) au1[0], id2 = (int) au2[0];
        return (id1 - id2);
    }
}
