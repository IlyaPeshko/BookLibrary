package by.htp.app.Command.user;

import by.htp.app.Command.Command;
import by.htp.app.Exception.SQLExceptionDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 01.04.17.
 */
public class Calculate implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLExceptionDAO {
        String page;
        String val1 = req.getParameter("val1");
        String val2 = req.getParameter("val2");

        if (validate(val1, val2)){
            int result = calculate(val1, val2);
            req.setAttribute("result", result);
            page = "/user.jsp";
        } else {
            page = "/error.jsp";
        }
        return page;
    }

    private int calculate (String val1, String val2){
            int a = Integer.parseInt(val1);
            int b = Integer.parseInt(val2);

            int c =a + b;
        return c;
    }

    private boolean validate (String val1, String val2){
        if (val1 != null && !val1.isEmpty() && val2 != null && !val2.isEmpty()){
            return true;
        }
        return false;
    }
}
