package com.rejexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckforEmail1 {
    public static void main(String[] args) {
        Pattern p =Pattern.compile("[a-zA-Z0-9.-]*@[a-zA-Z]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher("sreekanthmallela75@gmail.com");
        boolean b =m.matches();
        System.out.println(b);
    }
}
