package com.sandeep;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class rough {
    public static String readString(Scanner in){
        String str;

        //string is simple pure input- we can simply trim it for wellness and return it
        str = in.nextLine();
        str.trim();

        return str;
    }

    public static int readInt(Scanner in){
        int n;
        while (true){
            try{
                String line = in.nextLine();
                line.trim();

                if (line.isEmpty()) {
                    System.out.print("Enter atleast one Integer - ");
                    continue;
                }

                String[] tokens = line.split("\\s+");
                if (tokens.length > 1) {
                    System.out.print("Enter only Single Integer - ");
                    continue;
                }

                n = Integer.parseInt(tokens[0]);
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print("Enter Valid Integer - ");
                //in.nextLine(); //consumes bad token ----> no need here as we already taken it as string
            }
        }
        return n;
    }

    public static float readFloat(Scanner in){
        float n;
        while (true){
            if (in.hasNextFloat()){
                n = in.nextFloat();
                break;
            } else {
                System.out.print("!!Not an Float!!, Retry - ");
                in.nextLine();
            }
        }
        return n;
    }

    public static int[] readArray(Scanner in){
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            try{
                String line = in.nextLine();
                line.trim();

                String[] tokens = line.split("\\s+");

                for (String token : tokens){
                    list.add(Integer.parseInt(token));
                }
                break; //it breaks from here after getting all integers perfectly
            } catch (InputMismatchException | NumberFormatException e ){
                System.out.print("Enter Valid arr - ");
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }
}

