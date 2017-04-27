package by.htp.app.DAO.User;

import by.htp.app.DAO.Book.ImplBookDAO;
import by.htp.app.Domain.User;
import by.htp.app.Exception.SQLExceptionDAO;
import java.sql.*;

import static by.htp.app.Utility.Permanent.*;

/**
 * Created by user on 01.04.17.
 */
public class ImplUserDAO implements UserDAO {
    public static final String jdbcDriver = "com.mysql.jdbc.Driver";
    public static final String loginColumnAttr = "login";
    public static final String passwordColumnAttr = "password";
    public static final String  roleColumnAttr = "role";

    private static ImplUserDAO instance = new ImplUserDAO();

    public static ImplUserDAO getInstance () {
        return instance;
    }

    @Override
    public User read(String login, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        User user = null;
        try {

            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
            String query = QUERY_USER_AUTH;

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String log = resultSet.getString(loginColumnAttr);
                String pass = resultSet.getNString(passwordColumnAttr);
                boolean role = resultSet.getBoolean(roleColumnAttr);
                user = new User(log, pass, role);
            }

        } catch (SQLExceptionDAO e){

        } catch (SQLException e) {

        } catch (ClassNotFoundException e) {

        } finally {
            closeConnectionSQL(preparedStatement, connection);
        }
        return user;
    }

    private static void closeConnectionSQL (PreparedStatement preparedStatement, Connection connection) {
        if (preparedStatement != null){
            try {
                preparedStatement.close();
                if (connection != null){
                    connection.close();}
            }catch (SQLException e) {
                System.out.println("sql error / close");
            }
        }
    }
}
