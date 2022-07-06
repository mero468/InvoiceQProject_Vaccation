package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

public class User {
    private String username;

    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(){
        Authenticator authenticate = new Authenticator(new User(this.username,this.password));
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



}
