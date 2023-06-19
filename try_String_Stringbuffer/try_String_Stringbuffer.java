package jun14.try_String_Stringbuffer;

public class try_String_Stringbuffer {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer("Celina");
        StringBuffer buff=new StringBuffer("Celina");
        StringBuffer a=new StringBuffer();

        System.out.println(buf.hashCode());
        System.out.println(buff.hashCode());
        a=buf.append(buff);
        System.out.println(a.hashCode());

        String n="Celina";
        String m ="Celina";
        String s[]={"Celina", "nas"};
        System.out.println(s[0]==m);
        String b=new String("Celina");
        System.out.println(n.hashCode());
        System.out.println(m.hashCode());
        String p=n.concat(m);
        System.out.println(p.hashCode());
    }
}
