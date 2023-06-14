package Exercises.String_Methods;

public class String_Methods {
    public static void main(String[] args) {
        String a="Nasreen";
        String b="Nasreen";
        System.out.println("A "+a );
        System.out.println("B "+b );
        System.out.println("A in HashCode"+a.hashCode() );
        System.out.println("B in Hashcode"+b.hashCode());
        System.out.println("Equals: "+ a.equals(b));
    }
}
