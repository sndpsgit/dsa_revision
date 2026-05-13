

import java.util.Arrays;
import java.util.Scanner;

import lib.dsaLib;

public class quicksort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr - ");
        int[] arr = lib.dsaLib.readArray(in);

        quickSort(0, arr.length-1, arr);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public static void quickSort(int l, int h, int[] arr){
        if (l >= h) return;

        int s = l, e = h;
        int m = (l+h)/2;
        int p = arr[m]; //pivot

        while (s<=e){
            while (arr[s] < p) s++;
            while (arr[e] > p) e--;
            if (s<=e){
                int temp = arr[s];
                arr[s++] = arr[e];
                arr[e--] = temp;
            }
        }

        quickSort(l, e, arr);
        quickSort(s, h, arr);
    }
}
