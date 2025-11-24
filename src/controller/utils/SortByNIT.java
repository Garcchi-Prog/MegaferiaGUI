/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.utils;

import java.util.Comparator;
import model.Publisher;

/**
 *
 * @author aesme
 */
public class SortByNIT implements Comparator<Publisher> {

    @Override
    public int compare(Publisher pub1, Publisher pub2) {
        int nit1, nit2;
        
        nit1 = StringToNIT(pub1);
        nit2 = StringToNIT(pub2);
        
        return nit1 - nit2;
    }

    private int StringToNIT(Publisher publisher) {
        String[] temp = publisher.getNit().split("-|\\.");
        String nitInt = "";
        
        for (int i = 0; i < temp.length; i++) {
            nitInt += temp[i];
        }
        
        return Integer.parseInt(nitInt);
    }
    
}
