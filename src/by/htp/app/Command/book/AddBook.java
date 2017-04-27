package by.htp.app.Command.book;

import by.htp.app.Command.Command;
import by.htp.app.Exception.SQLExceptionDAO;
import by.htp.app.Service.BookService;
import by.htp.app.Service.ImplBookService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.htp.app.Utility.Permanent.PAGE_INDEX;

/**
 * Created by user on 01.04.17.
 */
public class AddBook implements Command {
    private BookService service;

    {service = new ImplBookService();}

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO {
        String page;
        String title = req.getParameter("val1");
        String author = req.getParameter("val2");

        service.addBook(title, author);

        page = PAGE_INDEX;
        return page;
    }

}
