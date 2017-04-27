package by.htp.app.DAO.Book;

import by.htp.app.Domain.Book;
import by.htp.app.Exception.SQLExceptionDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static by.htp.app.Utility.Permanent.*;

/**
 * Created by user on 01.04.17.
 */
public class ImplBookDAO implements BookDAO {
    private static ImplBookDAO instance = new ImplBookDAO();

    public static ImplBookDAO getInstance () {
        return instance;
    }

    @Override
    public List<Book> read() throws SQLExceptionDAO {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        List <Book> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
            statement= connection.createStatement();
            resultSet = statement.executeQuery(QUERY_ALLBOOKS);

            while (resultSet.next()) {
                Book book = new Book();

                book.setAuthor(resultSet.getString("author"));
                book.setTittle(resultSet.getString("title"));
                book.setYear(resultSet.getInt("year"));
                book.setPrice(resultSet.getDouble("price"));
                book.setImageURL(resultSet.getString("imageURL"));
                book.setIdOZby(resultSet.getInt("idOZby"));

                list.add(book);}

        } catch (SQLExceptionDAO e){
                throw new SQLExceptionDAO("SQLExceptionDAO = connection error" + e);
        } catch (SQLException e) {
            System.out.println("SQLExceptionDAO = connection error " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("no jdbc.driver");
        }finally {
            closeConnectionSQL(statement, connection);
        }
        return list;
    }

    @Override
    public Book fetchBookById(int id) throws SQLExceptionDAO {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Book book = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
            statement= connection.createStatement();
            //resultSet = statement.executeQuery("SELECT * FROM book_library.book_extend where idOZby ='" + id + "' ;");
            resultSet = statement.executeQuery(QUERY_BY_ID + "'" + id + "'");

            while (resultSet.next()) {
                book = new Book();

                book.setAuthor(resultSet.getString("author"));
                book.setTittle(resultSet.getString("title"));
                book.setYear(resultSet.getInt("year"));
                book.setPrice(resultSet.getDouble("price"));
                book.setImageURL(resultSet.getString("imageURL"));
                book.setIdOZby(resultSet.getInt("idOZby"));
                book.setDescription(resultSet.getString("description"));
                book.setBookURL(resultSet.getString("bookURL"));

            }

        } catch (SQLExceptionDAO e){
                throw new SQLExceptionDAO("SQLExceptionDAO = connection error" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("no jdbc.driver");
        } catch (SQLException e) {

        } finally {
            closeConnectionSQL(statement, connection);
        }
        return book;
    }

    @Override
    public List<Book> fetchBookBySource(String source) throws SQLExceptionDAO {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List <Book> list = new ArrayList<>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
            statement= connection.createStatement();
            resultSet = statement.executeQuery(QUERY_BY_SOURCE + "'" + source + "' ;");


            while (resultSet.next()) {
                Book book = new Book();

                book.setAuthor(resultSet.getString("author"));
                book.setTittle(resultSet.getString("title"));
                book.setYear(resultSet.getInt("year"));
                book.setIdOZby(resultSet.getInt("idOZby"));
                book.setPrice(resultSet.getDouble("price"));
                book.setImageURL(resultSet.getString("imageURL"));


                list.add(book);}

        } catch (SQLExceptionDAO e){
            throw new SQLExceptionDAO("SQLExceptionDAO = connection error" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("no jdbc.driver");
        } catch (SQLException e) {
            System.out.println("SQLExceptionDAO = connection error " + e);
        } finally {
            closeConnectionSQL(statement, connection);
        }
        return list;
    }

    @Override
    public List<Book> fetchBookByDate(Date date) throws SQLExceptionDAO {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List <Book> list = new ArrayList<>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);
            statement= connection.createStatement();
            resultSet = statement.executeQuery(QUERY_TODAYBOOKS + "'" + date + "' ;");

            while (resultSet.next()) {
                Book book = new Book();

                book.setAuthor(resultSet.getString("author"));
                book.setTittle(resultSet.getString("title"));
                book.setYear(resultSet.getInt("year"));
                book.setPrice(resultSet.getDouble("price"));
                book.setIdOZby(resultSet.getInt("idOZby"));
                book.setImageURL(resultSet.getString("imageURL"));

                list.add(book);}

        } catch (SQLExceptionDAO e){
            throw new SQLExceptionDAO("SQLExceptionDAO = connection error" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("no jdbc.driver");
        } catch (SQLException e) {
            System.out.println("SQLExceptionDAO = connection error " + e);
        } finally {
            closeConnectionSQL(statement, connection);
        }
        return list;
    }

    private static void closeConnectionSQL (Statement statement, Connection connection) {
        if (statement != null){
            try {
                statement.close();
                if (connection != null){
                    connection.close();}
            }catch (SQLException e) {
                System.out.println("error sql connection");
            }
        }
    }

    @Override
    public void addBook(String title, String author) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);

            String query = "INSERT INTO `book_library`.`dev_book` (`title`, `author`) VALUES (?,?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.executeUpdate();
        } catch (SQLExceptionDAO e){
            try {
                throw new SQLExceptionDAO("SQLExceptionDAO = connection error" + e);
            } catch (SQLExceptionDAO throwables) {
                throwables.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                    if (connection != null){
                        connection.close();}
                }catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("error sql connection!");
                }
            }
        }
    }
}
