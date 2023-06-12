package Java_Test.StringChallenge;

import java.util.Locale;

public class StringChallenge {
    public static String sc(String text){
        String answer = text;
        System.out.println(answer);
        answer=answer.trim();
        System.out.println(answer);
        answer=answer.substring(0,5);
        System.out.println(answer);
        answer=answer.toUpperCase();
        System.out.println(answer);
        return answer;
    }

    public static void main(String args[]){
        sc("        programming");
    }
}
