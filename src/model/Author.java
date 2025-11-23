package model;

import java.util.ArrayList;

public class Author extends Person {

    private ArrayList<Book> books;

    public Author(long id, String firstname, String lastname) {
        super(id, firstname, lastname);
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getBookQuantity() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public String getRoleType() {
        return "Autor";
    }


    @Override
    public int getBookCount() {
        return this.getBookQuantity();
    }

    @Override
    public Object getPublisherInfo() {
        
        if (this.books == null || this.books.isEmpty()) {
            return "Sin Editorial";
        }
        
        if (this.books.get(0).getPublisher() != null) {
            return this.books.get(0).getPublisher().getName();
        } else {
            return "Sin Editorial";
        }
    }

}
