
package model;

import java.util.ArrayList;


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
