package basic.if_condition;

import java.util.Scanner;

public class If_Condition {
    public static void main(String args[])
    {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = in.next();
        System.out.println("Enter your age");
        age= in.nextInt();
        if (age>=18)
        {
            System.out.println(name+"'s age  is "+age);
            System.out.println(name+" is eligible for voting");
        }
    }
}
