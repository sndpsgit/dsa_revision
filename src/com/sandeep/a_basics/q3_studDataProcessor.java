package com.sandeep.a_basics;

/* Question is to take integer (total No of Students)
    Then take each marks & print calculate average and print it
  Learning : 
    - Arrays
    - Loop for input
*/
import java.util.*;

public class q3_studDataProcessor {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int students = in.nextInt();
    int[] studMarks = new int[students];
    System.out.println(Arrays.toString(studMarks));
  }
}
