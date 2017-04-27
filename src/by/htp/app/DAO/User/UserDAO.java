package by.htp.app.DAO.User;

import by.htp.app.Domain.User;

/**
 * Created by user on 01.04.17.
 */
public interface UserDAO {

    public User read (String userLogin, String userPassword);

}
