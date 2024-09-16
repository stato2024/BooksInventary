package Interface;

import Model.Book;

import java.util.List;

public interface BookServiceInterface {

    void addBook (Book book);

    void removeBook (Integer id );

    void updateBook(Integer id, Double price);

    List<Book> showAll();
}
