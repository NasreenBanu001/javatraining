package basic.Else_if_statement;

import java.util.Scanner;

public class Else_if_Statement {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the total mark: ");
        int tmark =in.nextInt();
        if (tmark>90 &&tmark<=100)
        {
            System.out.println("Grade O - Passed");
        }
        else if (tmark>80 &&tmark<=90)
        {
            System.out.println("Grade A+ - Passed");
        }
        else if (tmark>70 &&tmark<=80)
        {
            System.out.println("Grade A - Passed");
        }
        else if (tmark>=50 &&tmark<=70)
        {
            System.out.println("Grade B - Passed");
        }
        else
        {
            System.out.println("Grade U - Failed");
        }
    }
}
