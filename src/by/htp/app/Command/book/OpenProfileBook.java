package by.htp.app.Command.book;

import by.htp.app.Command.Command;
import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;
import by.htp.app.Service.BookService;
import by.htp.app.Service.ImplBookService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.htp.app.Utility.Permanent.PROFILE_BOOK;

/**
 * Created by user on 05.04.17.
 */
public class OpenProfileBook implements Command {
    private BookService service;
    private String page;
    private static final String profile = "profile_book";
    private static final String paramID = "id";

    {service = new ImplBookService();}

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO {
        int id = Integer.parseInt(req.getParameter(paramID));

        Book profile_book = service.fetchBookById(id);
        req.setAttribute(profile, profile_book);
        page = PROFILE_BOOK;

        return page;
    }
}
