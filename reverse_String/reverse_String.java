package jun14.reverse_String;

public class reverse_String {
    public static void main(String[] args) {
        StringBuilder buf=new StringBuilder("I am Learning Java code");
        System.out.println(buf);
        System.out.println(buf.hashCode());
        StringBuilder buff=new StringBuilder();
        for (int i =buf.length()-1; i>=0; i--) {
            buff.append(buf.charAt(i));
        }
        System.out.println(buff);

//To make letters Upper case:
        for (int i = 0; i <buf.length(); i++) {
            if(buf.charAt(i)>=97 &&buf.charAt(i)<=122){
                int c= (int)buf.charAt(i)-32;
                buf.setCharAt(i,(char)c);
            }

        }
        System.out.println("Upper case: " +buf);
        System.out.println(buf.hashCode());

        for (int i = 0; i <buf.length(); i++) {
            if(buf.charAt(i)>=65 &&buf.charAt(i)<=90){
                int c= (int)buf.charAt(i)+32;
                buf.setCharAt(i,(char)c);
                buff=buf;
            }

        }
        System.out.println("Lower Case: "+buff);
        System.out.println(buff.hashCode());
    }
}
