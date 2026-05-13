package com.sandeep.a_basics;

/* In these question I covered
  - String traversal
  - for each loop
  - Does Word contains specific set (Double for Loop)
  - Flags
*/

import java.util.*;

public class q2_passChecker {
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    System.out.println("!!! WELCOME TO PASSWORD STRENGTH CHECKER !!!");
    System.out.print("Please Enter Password - ");
    String passw = in.next();
    
    boolean lengthF = (passw.length() > 8) ? true : false;
    boolean digitF = checkDigit(passw);
    boolean lowercaseF = checkLowerCase(passw);
    boolean uppercaseF = checkUpperCase(passw);
    boolean specialCharF = checkSpecialChar(passw);
    
    
    if (lengthF && digitF && lowercaseF && uppercaseF && specialCharF) System.out.println("Password PASSED");
    else {      
      if (!lengthF) System.out.println("Password's Length should be greater than 8");
      if (!digitF) System.out.println("Password should contain atleast one digit [0-9]");
      if (!lowercaseF) System.out.println("Password should contain atleast one lowercase [a-b]");
      if (!uppercaseF) System.out.println("Password should contain atleast one uppercase [A-Z]");
      if (!specialCharF) System.out.println("Password should contain atleast one specialChar [~,!,@,#,$,%,^,&,*,(,),_]");
    }
  }
  
  public static boolean checkDigit(String passw){
    for (char c : passw.toCharArray()){
      for (int i = 0; i <= 9; i++) {
        if ( c-'0' == i ) return true;
      }
    }
    return false;
  }
  
  public static boolean checkLowerCase(String passw){
    for (char c : passw.toCharArray()){
      for (char ch = 'a'; ch <= 'z'; ch++) {
        if ( c == ch ) return true;
      }
    }
    return false;
  }
  
  public static boolean checkUpperCase(String passw){
    for (char c : passw.toCharArray()){
      for (char ch = 'A'; ch <= 'Z'; ch++) {
        if ( c == ch ) return true;
      }
    }
    return false;
  }
  
  public static boolean checkSpecialChar(String passw){
    for (char c : passw.toCharArray()){
      if (c == '~') return true;
      else if (c == '!') return true;
      else if (c == '@') return true;
      else if (c == '#') return true;
      else if (c == '$') return true;
      else if (c == '%') return true;
      else if (c == '^') return true;
      else if (c == '&') return true;
      else if (c == '*') return true;
      else if (c == '(') return true;
      else if (c == ')') return true;
    }
    return false;
  }
}
    
    
    
    
