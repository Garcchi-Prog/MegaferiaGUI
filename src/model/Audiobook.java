
package model;

import java.util.ArrayList;


public class Audiobook extends Book {
    
    private int duration;
    private Narrator narrador;

    public Audiobook(String title, ArrayList<Author> authors, String isbn, String genre, String format, double value, Publisher publisher, int duration, Narrator narrator) {
        super(title, authors, isbn, genre, format, value, publisher);
        this.duration = duration;
        this.narrador = narrator;
        
        this.narrador.addBook(this);
    }
    
    @Override
    public int getDuration() {
        return this.duration;
    }
    
    @Override
    public Narrator getNarrador() {
        return this.narrador;
    }
    
}
