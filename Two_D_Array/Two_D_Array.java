package basic.Two_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        int a[][]={ {10,20,30},
                    {40,50,60},
                    {70,80,90}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }
        int b[][]=new int[5][5];
        System.out.println("Enter values");
        Scanner in =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter values");
                b[i][j]= in.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(" "+b[i][j]);
            }
            System.out.println(" ");
        }
        //        //for 3-D array
//        int c[][][]=new int[3][3][3];
    }
}