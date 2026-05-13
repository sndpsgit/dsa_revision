package com.sandeep.c_recursion;

/*  Here simply understanding working behaviour or rec fxns and ways to see how we can achieve
*   ans by different ways of handling.
*   q. Linear srch on arr with tgt. just get list which contains the indexes of tgt. */

import java.util.ArrayList;
import java.util.Scanner;

public class q2_linearSrchRecc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = com.sandeep.a0_lib.dsaLib.readArray(in);

        System.out.print("Enter tgt - ");
        int tgt = com.sandeep.a0_lib.dsaLib.readInt(in);
        ArrayList<Integer> list1 = new ArrayList<>();
        recWay1(list1, 0, arr, tgt);
        System.out.println("List1 : " + list1);

        recWay2(0, arr, tgt);
        System.out.println("List2 : " + list2);

        System.out.println("List3 : " + recWay3(0, arr, tgt));
    }

    //Giving arra to rec fxn and it handovers to next rec fxn call & updates it..so on
    public static void recWay1(ArrayList<Integer> pos, int i, int[] arr, int tgt){
        if (i == arr.length) return;

        if (arr[i] == tgt) pos.add(i);

        recWay1(pos, i+1, arr, tgt);
    }

    //Simple Universal list- to add it via recfxn.
    static ArrayList<Integer> list2 = new ArrayList<>();
    public static void recWay2(int i, int[] arr, int tgt){
        if (i == arr.length) return;

        if (arr[i] == tgt) list2.add(i);

        recWay2(i+1, arr, tgt);
    }

    //Here Learning - join the curernt list and list get from recfxn
    public static ArrayList<Integer> recWay3(int i, int[] arr, int tgt){
        if (i == arr.length) return new ArrayList<Integer>();

        ArrayList<Integer> list = new ArrayList<>();
        if (arr[i] == tgt) list.add(i);

        list.addAll(recWay3(i+1, arr, tgt));
        return list;
    }
}
