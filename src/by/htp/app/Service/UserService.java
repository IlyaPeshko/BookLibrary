package by.htp.app.Service;

import by.htp.app.Domain.User;

/**
 * Created by user on 01.04.17.
 */
public interface UserService {

    public User authorize (String login, String password);

}
