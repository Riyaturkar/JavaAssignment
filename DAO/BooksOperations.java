package com.revature.mybooks;

import java.util.ArrayList;
import java.util.List;

public class BooksOperations {

    List<Book> books;

    public BooksOperations() {
        books=new ArrayList();
        books.add(new Book(1,"Happy Potter and the Chamber of Secrets"));
        books.add(new Book(2,"Harry Potter and Half Blood Prince"));

    }

    public List<Book> getAllBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book getBookByIsbn(int isbn){

        Book book=new Book();
        // Write logic here
        return book;
    }

    public void updateBook(int isbn,Book updateBook){

        // Write logic here
    }


    public void deleteBook(int isbn){
        // Write logic here
    }
}
