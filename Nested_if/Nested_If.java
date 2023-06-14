package basic.Nested_if;

import java.util.Scanner;

public class Nested_If {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your marital status (m/u):");
        char marital = in.next().charAt(0);
        if (marital=='u'|| marital=='U')
        {
            System.out.println("Male or Female( M/F):");
            char gender=in.next().charAt(0);
            if(gender=='M'||gender=='m')
            {
                System.out.println("Enter your age: ");
                int age = in.nextInt();
                if (age>30)
                {
                    System.out.println("Eligible for Insurance.");
                }
                else{
                    System.out.println("Not Eligible for Insurance.");
                }
            }
            else if (gender=='f' || gender=='F')
            {
                System.out.println("Enter your age: ");
                int age = in.nextInt();
                if (age>25)
                {
                    System.out.println("Eligible for Insurance.");
                }
                else{
                    System.out.println("Not Eligible for Insurance.");
                }
            }
            else {
                System.out.println("Invalid input");
            }
            }
        else if (marital=='m'||marital=='M')
        {
            System.out.println("Eligible for Insurance.");
        }
        else {
            System.out.println("Invalid input");
        }
        }
    }

