package basic.Group_switch;

import java.util.Scanner;

public class Group_Switch {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a character:");
        char Character= in.next().charAt(0);
        switch(Character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(Character+" is a vowels");
                break;
            default:
                System.out.println(Character+" is a consonant");

        }


    }
}
