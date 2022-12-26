package com.rejexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//first way to do regex
public class RegexDemo {
    public static void main(String[] args) {
   /*     Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("ss");
        boolean b = m.matches();
        //second way to do regex
        boolean b1 = Pattern.compile(".c").matcher("cc").matches();
        //third way to do regex
        boolean b2 = Pattern .matches(".a" , "bb");
        System.out.println(b+" "+b1+" "+b2);
        //to insert password by using regex
        System.out.println(Pattern.matches("[0-9]{10}","8790662584"));*/

        Pattern p1 = Pattern.compile("[789][0-9]{9}");
        Matcher m1 = p1.matcher(args[0]);
        if (m1.find()&&m1.group().equals(args[0])){
            System.out.println(args[0]+"is a valid no ");
        }
        else {
            System.out.println(args[0]+"is not valid no");
        }
    }
}
