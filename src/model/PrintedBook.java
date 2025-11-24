
package model;

import model.Book;
import model.Author;
import java.util.ArrayList;


public class PrintedBook extends Book {
    
    private int pages;
    private int copies;

    public PrintedBook(String title, ArrayList<Author> authors, String isbn, String genre, String format, double value, Publisher publisher, int pages, int copies) {
        super(title, authors, isbn, genre, format, value, publisher);
        this.pages = pages;
        this.copies = copies;
    }
    
    @Override
    public int getPages() {
        return this.pages;
    }
    
    @Override
    public int getCopies() {
        return this.copies;
    }
    
}
