package Exercises.Mul_table;

import java.util.Scanner;

public class Mul_table {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the multiplication table: ");
        int table= in.nextInt();
        System.out.println("Enter the limit of the table to be printed:");
        int limit = in.nextInt();
        for(int i=1; i<=limit;i++){
            System.out.println(table+"*"+i+"="+table*i);
        }

    }
}
