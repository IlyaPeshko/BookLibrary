package by.htp.app.Command;

import by.htp.app.Command.book.AddBook;
import by.htp.app.Command.user.Authentication;
import by.htp.app.Command.user.Calculate;
import by.htp.app.Command.book.OpenProfileBook;
import by.htp.app.Command.user.LogOut;

/**
 * Created by user on 29.03.17.
 */
public class CommandChooser {

    public static Command chooseCommand (String name){

        Command currCommand = null;
            switch (name){
                case "auth":
                    currCommand =new Authentication();
                    break;
                case "calculate":
                    currCommand = new Calculate();
                    break;
                case "addBook":
                    currCommand = new AddBook();
                    break;
                case "logOut":
                    currCommand = new LogOut();
                    break;
                case "open_profile":
                    currCommand = new OpenProfileBook();
                    break;
                default:
            }
        return  currCommand;
    }
}
