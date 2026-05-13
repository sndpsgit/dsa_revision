package com.sandeep.c_recursion;

import java.util.Scanner;

public class q7_stringTraversalRecc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String - ");
        String s = com.sandeep.a0_lib.dsaLib.readString(sc);

        System.out.println("\"app\" ignored only : " + recfx(s));
    }

    public static String recfx(String s){
        if (s.length() <= 2) return s;

        if (s.startsWith("app")){
            if (s.length() >= 5 && s.startsWith("apple")) return "apple" + recfx(s.substring(5));
            else return recfx(s.substring(3));
        } else  return s.charAt(0) + recfx(s.substring(1));
    }
}
