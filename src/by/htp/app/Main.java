package by.htp.app;


import by.htp.app.DAO.Book.ImplBookDAO;
import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;
import by.htp.app.Service.ImplBookService;

import java.sql.Date;


/**
 * Created by user on 31.03.17.
 */
public class Main {
    private static Date date = new Date(System.currentTimeMillis());

    public static void main(String[] args) throws SQLExceptionDAO {
        ImplBookService service = new ImplBookService();
        ImplBookDAO dao = new ImplBookDAO();
        //date.setTime(2017-04-07);
        System.out.println(date);
        //Book book = dao.fetchBookByDate(date);
        //List<Book> books = dao.read();
        //System.out.println(book);

    }
}
