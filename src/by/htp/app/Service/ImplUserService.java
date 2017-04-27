package by.htp.app.Service;

import by.htp.app.DAO.User.ImplUserDAO;
import by.htp.app.DAO.User.UserDAO;
import by.htp.app.Domain.User;

/**
 * Created by user on 01.04.17.
 */
public class ImplUserService implements UserService {

    @Override
    public User authorize(String login, String password) {

        User user = ImplUserDAO.getInstance().read(login, password);
        return user;
    }
}
