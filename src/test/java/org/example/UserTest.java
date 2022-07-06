package org.example;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {



    @org.junit.jupiter.api.Test
     void UserEmpty(){
        User empty_user = new User(" "," ");
        boolean expected = true;
        UserAccountChecker checker = new UserAccountChecker(empty_user);
        boolean result = checker.isEmpty();
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void InvalidLength(){
        User InvalidUsername = new User("12345678910111213145667755"," ");
        boolean expected = false;
        UserAccountChecker checker = new UserAccountChecker(InvalidUsername);
        boolean result = checker.UsernameLengthCheck();
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void ValidLength(){
        User InvalidUsername = new User("mohammad khanakeen"," ");
        boolean expected = true;
        UserAccountChecker checker = new UserAccountChecker(InvalidUsername);
        boolean result = checker.UsernameLengthCheck();
        assertEquals(expected,result);
    }

}