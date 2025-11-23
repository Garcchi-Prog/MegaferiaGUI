package model;

import java.util.ArrayList;

public class Stand {

    private long id;
    private double price;
    private ArrayList<Publisher> publishers;
    private boolean compra;

    public Stand(long id, double price) {
        this.id = id;
        this.price = price;
        this.publishers = new ArrayList<>();
        this.compra = false;
    }

    public void addPublisher(Publisher publisher) {
        this.publishers.add(publisher);
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public boolean isCompra() {
        return compra;
    }

    public int getPublisherQuantity() {
        return this.publishers.size();
    }

}
