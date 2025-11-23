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
public class SortByISBN implements Comparator<Object[]>{

    @Override
    public int compare(Object[] book1, Object[] book2) {
        int isb1, isb2;
        
        isb1 = isbnToInt(book1[2]);
        isb2 = isbnToInt(book2[2]);
        
        return isb1 - isb2;
    }

    private int isbnToInt(Object isbn) {
        String[] temp1 = String.class.cast(isbn).split("-");
        String isbnInt = "";
        for (int i = 0; i < temp1.length; i++) {
            isbnInt += temp1[i];
        }
        
        return Integer.parseInt(isbnInt);
    }
}
