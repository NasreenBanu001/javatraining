package Exercises.Array_elementinsertion;

import java.util.Arrays;
import java.util.Scanner;

public class Array_elementinsertion {
    public static void main(String[] args) {
        int index=2;
        int value=55;
        Scanner in = new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println("before Insert: " + Arrays.toString(a));
        for (int i = a.length-1; i >index ; i--) {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After Insertion: " +Arrays.toString(a) );

        System.out.println("Without changing the values of other index:");
        a[5]=66;
        System.out.println("After Insertion without changing the other index : " +Arrays.toString(a) );

    }
}
