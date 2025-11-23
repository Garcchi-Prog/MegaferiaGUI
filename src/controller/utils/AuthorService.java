
package controller.utils;

import java.util.ArrayList;
import model.Author;
import model.Book;
import model.Publisher;


public abstract class AuthorService {
    public static int calculateUniquePublisherQuantity(Author author) {
        ArrayList<Publisher> publishers = new ArrayList<>();
        for (Book book : author.getBooks()) {
            if (!publishers.contains(book.getPublisher())) {
                publishers.add(book.getPublisher());
            }
        }
        return publishers.size();
    }
}
