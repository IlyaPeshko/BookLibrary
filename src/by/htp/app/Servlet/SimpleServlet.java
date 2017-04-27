package by.htp.app.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 28.03.17.
 */
public class SimpleServlet extends HttpServlet {

    public SimpleServlet() {
    }
    private String login;
    private String pass;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //PrintWriter printWriter = resp.getWriter();
        //printWriter.print("SimpleServlet");

        login = req.getParameter("login");
        pass =  req.getParameter("pass");

        if ("login".equals(login) & "pass".equals(pass)){
            resp.getWriter().write("success");
        }else {
            resp.getWriter().write("try again");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

