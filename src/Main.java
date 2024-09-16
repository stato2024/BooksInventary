import Interface.BookServiceInterface;
import Model.Book;
import Service.ServiceBook;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookServiceInterface serviceBook = new ServiceBook();
        boolean continuar = true;
        Book B1 = null;
        B1 = new Book(1,"Florecer en el encierro","Sebastian Trueba",35000.0,2024);
        serviceBook.addBook(B1);
        List<Book> books = serviceBook.showAll();
        for (Book book : books){
            System.out.println(book);
        }



        }
    }
