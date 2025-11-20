/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Megaferia {
    
    private static Megaferia instance;

    private ArrayList<Stand> stands;
    private ArrayList<Author> authors;
    private ArrayList<Manager> managers;
    private ArrayList<Narrator> narrators;
    private ArrayList<Publisher> publishers;
    private ArrayList<Book> books;

    private Megaferia() {
        this.stands = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.narrators = new ArrayList<>();
        this.publishers = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public static Megaferia getInstance() {
        if (instance == null) {
            instance = new Megaferia();
        }
        return instance;
    }

    
    public void addStand(Stand stand) {
        this.stands.add(stand);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }

    public void addNarrator(Narrator narrator) {
        this.narrators.add(narrator);
    }

    public void addPublisher(Publisher publisher) {
        this.publishers.add(publisher);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    
    public ArrayList<Stand> getStands() {
        return stands;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public ArrayList<Narrator> getNarrators() {
        return narrators;
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
