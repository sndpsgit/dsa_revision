package com.sandeep.a_basics;

/* What I learned here is
  - int/float/String - Prim data types
  - input & output them
  - if_else statement
  - for statement
  
  - Conversion: String---> Prim Data types
  - Take Math.max(multipleValue)
  - Manual Formatting --> Formating is another league (Rendering & UI World there)
*/

import java.util.*;

public class q1_basicsIfConditions{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		String name, city;
		int age;
		float height;
		String ageStr, heightStr;
		
		System.out.println("!!! Welocome to Profile Analyzer !!!");

		System.out.print("Enter your name - ");
		name = in.nextLine();

		System.out.print("Enter your age - ");
		age = in.nextInt();
		in.nextLine();

		System.out.print("Enter your height - ");
		height = in.nextFloat();
		in.nextLine();
		
		System.out.print("Enter your city - ");
		city = in.nextLine();

    ageStr = String.valueOf(age);
    heightStr = String.valueOf(height);
    
    
    if (age < 18) ageStr = ageStr + " (Minor)";
    else if (age < 60) ageStr = ageStr + " (Adult)";
    else ageStr = ageStr + " (Senior)";
    
    if (height < 5.0) heightStr = heightStr + " (Short)";
    else if (height < 5.9) heightStr = heightStr + " (Average)";
    else heightStr = heightStr + " (Tall)";
    
    int maxLen = Math.max(Math.max(ageStr.length()+4, heightStr.length()+7), Math.max(name.length()+5, city.length()+5));
    String header = "Good Person";
    
    int diff = (header.length() > maxLen) ? 0 : maxLen - header.length();
    diff = (diff % 2 == 0) ? diff : diff + 1;
    
    for (int i = 0; i < (diff/2); i++) System.out.print("-");
    System.out.print(header);
    for (int i = 0; i < (diff/2); i++) System.out.print("-");
    System.out.println();
    
    System.out.print("Name:");
    for (int i = 0; i < (diff - name.length() + 6); i++) System.out.print(" ");
    System.out.println(name);
    
    System.out.print("Age:");
    for (int i = 0; i < (diff - ageStr.length() + 7); i++) System.out.print(" ");
    System.out.println(ageStr);
    
    System.out.print("Height:");
    for (int i = 0; i < (diff - heightStr.length() + 4); i++) System.out.print(" ");
    System.out.println(heightStr);
    
    System.out.print("City:");
    for (int i = 0; i < (diff - city.length() + 6); i++) System.out.print(" ");
    System.out.println(city);
    
    for (int i = 0; i < diff + header.length(); i++) System.out.print("-");
    System.out.println();
  }
}
    
    

