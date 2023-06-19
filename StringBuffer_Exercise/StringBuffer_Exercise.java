package jun14.StringBuffer_Exercise;

public class StringBuffer_Exercise {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer("Nasreen, Belong to Chennai-96");
        System.out.println(buf);
        System.out.println("length of string:"+buf.length());
        int upper=0,lower=0,space=0,vowels=0,numbers=0;
        for (int i = 0; i < buf.length(); i++) {
            if(buf.charAt(i)>=60 && buf.charAt(i)<=90){
                upper++;
            }
            if(buf.charAt(i)>=97 && buf.charAt(i)<=122){
                lower++;
            }
            if(buf.charAt(i)>=48 && buf.charAt(i)<=57){
                numbers++;
            }
            if(buf.charAt(i)==32){
                space++;
            }
            if(buf.charAt(i)=='A'|| buf.charAt(i)=='E'|| buf.charAt(i)=='I' || buf.charAt(i)=='O' ||buf.charAt(i)=='U' || buf.charAt(i)=='a' || buf.charAt(i)=='e' ||buf.charAt(i)=='i' ||buf.charAt(i)=='o' ||buf.charAt(i)=='u'){
                vowels++;
            }

        }
        System.out.println("Upper Case:"+upper);
        System.out.println("Lower Case:"+lower);
        System.out.println("Vowels:"+vowels);
        System.out.println("Spaces:"+space);
        System.out.println("Numbers:"+numbers);
        System.out.println("Special char:"+ (buf.length()-(upper+lower+space+numbers)));
    }
}
