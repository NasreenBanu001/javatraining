package basic.Array;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
            int a[]={10,20,30,40,50};
            for (int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
            int b[]= new int[5];
            for (int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
            int c[]= new int[5];
            for (int i=0;i<3;i++){
                System.out.println("Enter the number:");
                c[i]=in.nextInt();
            }
        for (int i=0;i<c.length;i++){
            System.out.println("The array elements are:" +c[i]);
        }

        }
    }

