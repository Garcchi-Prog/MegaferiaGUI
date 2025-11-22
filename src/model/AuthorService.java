/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Garcchi
 */
public class AuthorService {
    public int calculateUniquePublisherQuantity(Author author) {
        ArrayList<Publisher> publishers = new ArrayList<>();
        for (Book book : author.getBooks()) {
            if (!publishers.contains(book.getPublisher())) {
                publishers.add(book.getPublisher());
            }
        }
        return publishers.size();
    }
}
