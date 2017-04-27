package by.htp.app.Service;

import by.htp.app.DAO.Book.BookDAO;
import by.htp.app.DAO.Book.ImplBookDAO;
import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 01.04.17.
 */
public class ImplBookService implements BookService {

    //private BookDAO dao;
    //{dao = new ImplBookDAO();}

    @Override
    public List<Book> listBooks() throws SQLExceptionDAO {
        //List<Book> books = dao.read();
        List<Book> books = ImplBookDAO.getInstance().read();
        return books;
    }

    @Override
    public void addBook(String title, String author) {
        //dao.addBook(title, author);
        ImplBookDAO.getInstance().addBook(title, author);
    }

    @Override
    public Book fetchBookById(int id) throws SQLExceptionDAO {
        //Book profile_book = dao.fetchBookById(id);
        Book profile_book = ImplBookDAO.getInstance().fetchBookById(id);
        return profile_book;
    }

    @Override
    public List <Book> fetchBooksBySource(String source) throws SQLExceptionDAO {
        //List<Book> books = dao.fetchBookBySource(source);
        List<Book> books = ImplBookDAO.getInstance().fetchBookBySource(source);
        return books;
    }

    @Override
    public List <Book> fetchBooksByDate(Date date) throws SQLExceptionDAO {
        //List <Book> books = dao.fetchBookByDate(date);
        List <Book> books = ImplBookDAO.getInstance().fetchBookByDate(date);
        return books;
    }
}
