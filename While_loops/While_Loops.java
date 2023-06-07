package basic.While_loops;

import java.util.Scanner;

public class While_Loops {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a limit:");
        int limit=in.nextInt();
        int i=1;
        while(i<=limit){
            System.out.println(i);
            i++;

        }
    }

}
