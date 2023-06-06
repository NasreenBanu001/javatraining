package basic.Switch_case;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String args[])
    {
        int a,b,c, choice;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your Choice");
        Scanner in=new Scanner(System.in);
        choice= in.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("---Addition---");
                System.out.println("Enter a number:");
                a= in.nextInt();
                System.out.println("Enter another number:");
                b= in.nextInt();
                c=a+b;
                System.out.println("addition of" +a +"and "+b +"is "+c);
                break;

            case 2:
                System.out.println("---Subtraction---");
                System.out.println("Enter a number:");
                a= in.nextInt();
                System.out.println("Enter another number:");
                b= in.nextInt();
                c=a-b;
                System.out.println("Subtraction of" +a +"and "+b +"is "+c);
                break;
            case 3:
                System.out.println("---multiplication---");
                System.out.println("Enter a number:");
                a= in.nextInt();
                System.out.println("Enter another number:");
                b= in.nextInt();
                c=a*b;
                System.out.println("division of" +a +"and "+b +"is "+c);
                break;

            case 4:
                System.out.println("---Addition---");
                System.out.println("Enter a number:");
                a= in.nextInt();
                System.out.println("Enter another number:");
                b= in.nextInt();
                c=a/b;
                System.out.println("division of" +a +"and "+b +"is "+c);
                break;


            default:
                System.out.println("Invalid choice");

        }

    }
}
