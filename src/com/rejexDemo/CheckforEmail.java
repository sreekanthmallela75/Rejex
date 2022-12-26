package com.rejexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckforEmail {
    public static boolean emailValidation(String Email) {

        String emailrejex = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
       // String   emailrejex ="[a-zA-Z0-9.-]*@[a-zA-Z]+([.][a-zA-Z]+)+");
        Pattern p1 = Pattern.compile(emailrejex);
        Matcher m1 = p1.matcher(Email);
        return m1.matches();
    }

    public static void main(String[] args) {
        String Email="sreekanthmallela75@gmail.com";
    boolean valid =emailValidation(Email);
        if (valid){
            System.out.println(Email+"is a valid Email id ");
        }
        else {
            System.out.println(Email+"is not valid Email id");
        }
    }
}

