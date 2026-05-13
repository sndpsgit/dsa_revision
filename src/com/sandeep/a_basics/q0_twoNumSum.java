package com.sandeep.a_basics;

/* what I learnt here
  - Simple syntax to java code & compile it and run it
  - integer Primitive data type
  - Taking input & Printing output
*/

/* import java.util.Scanner;

public class q0_twoNumSum {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter 1st Number : ");
        a = sc.nextInt();
        
        System.out.print("Please Enter 2nd Number : ");
        b = sc.nextInt();
        
        int c = a + b;
        System.out.println("Sum - " + c);
    }
} */


/*
import java.util.*;

public class q0_twoNumSum {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter 1st Number : ");
        while (true){
          try{
            a = sc.nextInt();
            break; //✅ break only when correct input
          }catch (InputMismatchException | NumberFormat Exception e){
            System.out.print("!!!Wrong Input!!!, Please Enter again : ");
            sc.nextLine();
          }
        }
        
        System.out.print("Please Enter 2nd Number : ");
        while (true){
          try{
            b = sc.nextInt();
            break; //✅ break only when correct input
          }catch (InputMismatchException e){
            System.out.print("!!!Wrong Input!!!, Please Enter again : ");
            sc.nextLine();
          }
        }
        
        int c = a + b;
        System.out.println("Sum - " + c);
    }
} */

import java.util.*;

public class q0_twoNumSum {
    /* Here I did 2 things- 1st created an Re-usable function that gives valid I/p & handle Error
                            2nd it handles Exception - without throwing exception- on validation.. */
    public static int readInt(Scanner in){ 
      int n;
      while (true){
        if(in.hasNextInt()){
          n = in.nextInt();
          break;
        } else {
          System.out.print("Invalid I/p, Retry - ");
          in.nextLine();
        }
      }
      return n;
    }
    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter 1st Number : ");
        a = readInt(sc);
        
        System.out.print("Please Enter 2nd Number : ");
        b = readInt(sc);
        
        int c = a + b;
        System.out.println("Sum - " + c);
    }
}

