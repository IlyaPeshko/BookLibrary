package by.htp.app.Utility;

/**
 * Created by user on 01.04.17.
 */
public final class Permanent {

    public static final String REQUEST_PARAM_ACTION = "action";
    public static final String SESSION_PARAM_USER = "user";

    public static final String PAGE_WELCOME_USER = "/welcome.jsp";
    public static final String PAGE_INDEX = "/index.html";
    //public static final String PAGE_WELCOME_ADMIN = "/admin_main.jsp";
    public static final String PAGE_WELCOME_ADMIN = "/WEB-INF/pages/admin_main.jsp";
    public static final String PAGE_ERROR = "error.jsp";
    public static final String PROFILE_BOOK = "/WEB-INF/pages/book_profile.jsp";

    public static final String REQUEST_PARAM_USER_LOGIN = "login";
    public static final String REQUEST_PARAM_USER_PASS = "pass";

    //public static final String SQL_URI = "jdbc:mysql://localhost:" + "3306/Cities?&characterEncoding=utf-8&...";
    public static final String SQL_URL = "jdbc:mysql://localhost:3306/book_library";
    public static final String SQL_USERNAME = "root";
    public static final String SQL_PASSWORD = "root";

    public static final String QUERY_ALLBOOKS = "SELECT * FROM book_extend";
    public static final String QUERY_TODAYBOOKS = "SELECT * FROM book_library.book_extend where addDate =";
    public static final String QUERY_BY_ID = "SELECT * FROM book_library.book_extend where idOZby = ";
    public static final String QUERY_BY_SOURCE = "SELECT * FROM book_library.book_extend where source =";

    public static final String QUERY_USER_AUTH = "SELECT * FROM user WHERE user.login =? and user.password=?";

    private Permanent() {}
}
