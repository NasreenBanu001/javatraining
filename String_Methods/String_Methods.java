package jun14.String_Methods;

public class String_Methods {
    public static void main(String[] args) {
        String a="Nasreen";
        String b="Nasreen";
        String c ="nasreen";
        System.out.println("A "+a );
        System.out.println("B "+b );
        System.out.println("A in HashCode"+a.hashCode() );
        System.out.println("B in Hashcode"+b.hashCode());
        System.out.println("Equals: "+ a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //now we are changing the value of a. So the hashcode will also be changed
        a=a.replace("ee","e");
        System.out.println(a);
        System.out.println("A in HashCode"+a.hashCode() );
        System.out.println(a.isEmpty());
        System.out.println(a.endsWith("n"));
        System.out.println(a.startsWith("t"));
        System.out.println(a);

    }

}
