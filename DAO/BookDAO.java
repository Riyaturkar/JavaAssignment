package com.revature.mybooks;

import java.util.List;

public interface BookDAO {

    public List<Book> getAllBooks();
    public void addBook(Book book);
    public Book getBookByIsbn(int isbn);
    public void updateBook();
}
