package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticatorTest {

    @org.junit.jupiter.api.Test
    void ValidUser_Password() {
        User valid_user = new User("ammar","1234");
        Authenticator authenticator = new Authenticator(valid_user);
        boolean expected = true;
        boolean result = authenticator.MatchUsernamePassword(valid_user);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void InValidUser() {
        User Invalid_user = new User("metwalli","1234");
        Authenticator authenticator = new Authenticator(Invalid_user);
        boolean expected = false;
        boolean result = authenticator.MatchUsernamePassword(Invalid_user);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void ValidUser_InvalidPassword(){
        User Invalid_user = new User("ammar","12346872");
        Authenticator authenticator = new Authenticator(Invalid_user);
        boolean expected = false;
        boolean result = authenticator.MatchUsernamePassword(Invalid_user);
        assertEquals(result,expected);
    }

    @org.junit.jupiter.api.Test
    void SuccessMsg_received(){
        User valid_user = new User("ammar","1234");
        Authenticator authenticator = new Authenticator(valid_user);
        String expected = "Login Successful";
        boolean validation = authenticator.MatchUsernamePassword(valid_user);
        String result = AuthenticatorPrinter.printMsg(validation);
        assertEquals(result,expected);
    }


}