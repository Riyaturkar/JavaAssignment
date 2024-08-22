package com.revature.mybooks;

import java.util.ArrayList;
import java.util.List;

public class BooksMain {
    public static void main(String[] args) {
        BooksOperations booksOperations=new BooksOperations();
        List<Book> allBooks=booksOperations.getAllBooks();
        for(Book b:allBooks)
            System.out.println(b.getIsbn() +" - "+b.getName());

        Book newBook=new Book(3,"Song of Fire and Ice");
        booksOperations.addBook(newBook);


        for(Book b:allBooks)
            System.out.println(b.getIsbn() +" - "+b.getName());
    }


}
