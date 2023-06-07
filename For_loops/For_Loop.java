package basic.For_loops;

import java.util.Scanner;

public class For_Loop {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit= in.nextInt();
        for( int i=1;i<=limit;i++) {
            System.out.println(i);
        }
        System.out.println("Output of Enhanced for loop:");
        int number[] ={10,20,30,40,50,60,70};
        for (int n : number){
            System.out.println(n);
        }

        }

    }
