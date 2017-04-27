package by.htp.app.Command;

import by.htp.app.Exception.SQLExceptionDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 29.03.17.
 */
public interface Command {

    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO;
}
