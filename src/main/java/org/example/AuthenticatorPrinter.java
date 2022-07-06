package org.example;

public class AuthenticatorPrinter {

    public static String printMsg(boolean validated){
        if(validated)
            return "Login Successful";
        else
            return "Incorrect Username Or Password";
    }


}
