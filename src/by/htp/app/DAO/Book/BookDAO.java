package by.htp.app.DAO.Book;

import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;

import java.sql.Date;
import java.util.List;

/**
 * Created by user on 01.04.17.
 */
public interface BookDAO {

    public List <Book> read() throws SQLExceptionDAO;

    public void addBook (String title, String author);

    public Book fetchBookById (int id) throws SQLExceptionDAO;

    List<Book> fetchBookBySource (String source) throws SQLExceptionDAO;

    List<Book> fetchBookByDate (Date date) throws SQLExceptionDAO;
}
