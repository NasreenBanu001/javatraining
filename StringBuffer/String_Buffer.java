package jun14.StringBuffer;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer("Shooting Star");
        System.out.println(b);
        System.out.println(b.append(" beautiful"));
        System.out.println(b.insert(14,"looks "));
        System.out.println(b.replace(14, 20,"being "));
        System.out.println(b.delete(14,30));
        System.out.println(b.reverse());
        System.out.println(b.reverse());
        System.out.println(b.charAt(2));
        System.out.println(b.length());
        System.out.println(b.substring(9));
        System.out.println(b.substring(0,5));
        System.out.println(b);
        b= b.append(" Beautiful");
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.capacity());


    }
}
