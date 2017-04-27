package by.htp.app.Servlet;

import by.htp.app.Command.Command;
import by.htp.app.Command.CommandChooser;
import by.htp.app.Exception.SQLExceptionDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static by.htp.app.Utility.Permanent.*;
//import static by.htp.app.Utility.*;

/**
 * Created by user on 29.03.17.
 */

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (SQLExceptionDAO throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //PrintWriter printWriter = resp.getWriter();
        try {
            processRequest(req,resp);
        } catch (SQLExceptionDAO throwables) {
            throwables.printStackTrace();
        }


    }

    public void forward(HttpServletRequest req, HttpServletResponse resp, String page) throws ServletException, IOException{
        RequestDispatcher disp =req.getRequestDispatcher(page);
        disp.forward(req, resp);
    }

    public  void processRequest (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLExceptionDAO {
        String action = req.getParameter(REQUEST_PARAM_ACTION);
        Command command = CommandChooser.chooseCommand(action);
        String page = command.execute(req,resp);
        forward(req,resp, page);

    }

}
