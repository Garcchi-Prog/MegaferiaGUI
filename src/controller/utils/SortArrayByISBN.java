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
public class SortArrayByISBN implements Comparator<Object[]>{

    @Override
    public int compare(Object[] book1, Object[] book2) {
        int isb1, isb2;
        
        isb1 = isbnToInt(book1[2]);
        isb2 = isbnToInt(book2[2]);
        
        return isb1 - isb2;
    }

    private int isbnToInt(Object isbn) {
        String[] temp = String.class.cast(isbn).split("-");
        String isbnInt = "";
        for (int i = 0; i < temp.length; i++) {
            isbnInt += temp[i];
        }
        
        return Integer.parseInt(isbnInt);
    }
}
