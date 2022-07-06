package org.example;

public class UserAccountChecker {
    private final User CurentUser;

    public UserAccountChecker(User curentUser) {
        CurentUser = curentUser;
    }

    public boolean isEmpty(){
        boolean username_empty = CurentUser.getUsername().matches("^\\s*$");
        boolean password_empty  = CurentUser.getPassword().matches("^\\s*$");
        return username_empty || password_empty;
    }

    public boolean UsernameLengthCheck(){
        int maximum_Length = 20;
        return CurentUser.getUsername().length() < maximum_Length;
    }

}
