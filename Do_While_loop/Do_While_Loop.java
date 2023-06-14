package basic.Do_While_loop;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit= in.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=limit);
    }
}
