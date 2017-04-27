package by.htp.app.Command.user;


import by.htp.app.Command.Command;
import by.htp.app.Domain.Book;
import by.htp.app.Domain.User;
import by.htp.app.Exception.SQLExceptionDAO;
import by.htp.app.Service.BookService;
import by.htp.app.Service.ImplBookService;
import by.htp.app.Service.ImplUserService;
import by.htp.app.Service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Date;
import java.util.List;

import static by.htp.app.Utility.Permanent.*;

/**
 * Created by user on 29.03.17.
 */
public class Authentication implements Command {
    private static Date date = new Date(System.currentTimeMillis());

    private UserService service;
    private BookService serviceBook;

    private static final String attBooksAll = "books";
    private static final String attBooksBiblio = "booksBiblio";
    private static final String attSourceBiblio = "biblio";

    private static final String attBooksOZ = "booksOZ";
    private static final String attSourceOZ = "oz";
    private static final String attBooksToday = "booksToday";

    {service = new ImplUserService();
    serviceBook = new ImplBookService();}

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO {

        String page = null;
        String login = req.getParameter(REQUEST_PARAM_USER_LOGIN);
        String pass =  req.getParameter(REQUEST_PARAM_USER_PASS);

        User user = service.authorize(login, pass);

        if (user !=null){
            HttpSession session = req.getSession();
            session.setAttribute(SESSION_PARAM_USER, user);

            List <Book> books = serviceBook.listBooks();
            req.setAttribute(attBooksAll, books);

            List <Book> booksBiblio = serviceBook.fetchBooksBySource(attSourceBiblio);
            req.setAttribute(attBooksBiblio, booksBiblio);

            List <Book> booksOZ = serviceBook.fetchBooksBySource(attSourceOZ);
            req.setAttribute(attBooksOZ, booksOZ);

            List <Book> booksToday = serviceBook.fetchBooksByDate(date);
            req.setAttribute(attBooksToday, booksToday);

            page = PAGE_WELCOME_USER;
            if (user.isRole()) {
                page = PAGE_WELCOME_ADMIN;
            }


        }else {
            page = PAGE_ERROR;
            req.setAttribute("ERROR", "wrong login or password, try again");

        }
        return page;
    }




}
