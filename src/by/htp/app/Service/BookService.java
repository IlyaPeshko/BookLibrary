package by.htp.app.Service;

import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;

import java.sql.Date;
import java.util.List;

/**
 * Created by user on 01.04.17.
 */
public interface BookService {
    public List <Book> listBooks () throws SQLExceptionDAO;

    public void addBook (String title, String author);

    public Book fetchBookById (int id) throws SQLExceptionDAO;

    public List <Book> fetchBooksBySource (String source) throws SQLExceptionDAO;

    public List <Book> fetchBooksByDate (Date date) throws SQLExceptionDAO;
}
