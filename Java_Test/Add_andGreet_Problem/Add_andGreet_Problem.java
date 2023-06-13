package Java_Test.Add_andGreet_Problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Add_andGreet_Problem {
    private ArrayList<String>Name=new ArrayList<>();
    private ArrayList<String>Age=new ArrayList<>();
    Scanner in=new Scanner(System.in);
    public void add_family_member(){
        System.out.println("Enter name:");
        String name=in.next();
        Name.add(name);
        System.out.println("Enter age:");
        String age=in.next();
        Age.add(age);
        System.out.println("New family member is added");
    }
    public void greet(){
        Iterator n= Name.iterator();
        while (n.hasNext()){
        System.out.print(n.next() +",");
}
        System.out.println(" We Heartily welcomes you all to our family function!!!");
    }
    public static void main(String[] args) {
        Add_andGreet_Problem a=new Add_andGreet_Problem();


while (true){
        System.out.println("A). Add a member");
        System.out.println("G). Greet All");
        System.out.println("E). Exit");
        System.out.println("Enter your Choice");
        Scanner in=new Scanner(System.in);
        char choice= in.next().charAt(0);

        switch (choice)
        {
            case 'A':
                a.add_family_member();
                break;

            case 'G':
                a.greet();
                break;
            case 'E':
                System.out.println("....Exit...");
                System.exit(0);
                break;
            default:
                System.out.println("Enter a valid input");
    }}
}}
