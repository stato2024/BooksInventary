package Service;

import Interface.BookServiceInterface;
import Model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceBook implements BookServiceInterface {

    private List<Book> inventary = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (!inventary.contains(book)) {
            inventary.add(book);
            System.out.println("Libro agregado al inventario: " + book.getTitle());
        } else {
            System.out.println("El libro ya exsiste en el inventario");
        }
    }

    @Override
    public void removeBook(Integer id) {
        Book bookRemove = null;
        for (Book book : inventary){
            if (Objects.equals(book.getId(), id)){
                bookRemove = book;
                break;
            }
        }
        if (bookRemove!=null){
            inventary.remove(bookRemove);
            System.out.println("El libro fue ");
        }

    }


}
