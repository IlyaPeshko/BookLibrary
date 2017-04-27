package by.htp.app.Exception;

import java.sql.SQLException;

/**
 * Created by user on 31.03.17.
 */
public class SQLExceptionDAO extends SQLException {

    public SQLExceptionDAO(String msg) {
        super(msg);
    }
}
