package model;

public class Manager extends Person {

    private Publisher publisher;

    public Manager(long id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getRoleType() {
        return "Gerente";
    }

    @Override
    public Object getPublisherInfo() {

        if (this.publisher != null) {
            return this.publisher.getName();
        } else {
            return "Sin Asignar";
        }
    }

    
}
