package Exercises.Prime_With_Limit;

import java.util.Scanner;

public class Prime_With_Limit {
     public static void main(String args[]){
            Scanner in= new Scanner(System.in);
            System.out.println("The prime number between 100 and 999 are:");
            int flag=0;
             for (int i=100;i<=999;i++){
                for (int j=1;j<=999;j++) {
                    if (i % j == 0) {
                        flag++;
                    }
                    }
                if (flag==2)
                    {System.out.println(i+" ");
                 }
                flag=0;
                }
             }
}
