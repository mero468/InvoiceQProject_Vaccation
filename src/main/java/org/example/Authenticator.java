package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Authenticator {

    private ArrayList<User> UserList  = new ArrayList();

    public Authenticator(User user){
        //Add new Users to UserList, temporary and to be changed
        UserList.add(new User("ammar","1234"));
        UserList.add(new User("Mohammed","123"));
        UserList.add(new User("fadi","123456"));
        UserList.add(new User("hamza","321"));
        UserList.add(new User("batool","batool"));

    }

    public boolean MatchUsernamePassword(User currentUser){
        for (User user: UserList) {
            if(user.getUsername().equals(currentUser.getUsername())){
                return (user.getPassword().equals(currentUser.getPassword()));
            }
        }
        return false;
    }


}
