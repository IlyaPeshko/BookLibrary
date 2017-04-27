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
import java.util.List;

import static by.htp.app.Utility.Permanent.*;
import static by.htp.app.Utility.Permanent.PAGE_WELCOME_ADMIN;

/**
 * Created by user on 07.04.17.
 */
public class LogOut implements Command{

    private UserService service;
    private BookService serviceBook;
    private String page = PAGE_WELCOME_ADMIN;

    {service = new ImplUserService();}

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO {
        HttpSession session = req.getSession();
        session.invalidate();

        return page;
    }
}
