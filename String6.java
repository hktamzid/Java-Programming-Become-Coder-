import java.io.*;
public class String6 {
    public static void main(String[] args) throws Exception
    {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity());
        System.out.println(s1.length());

        s1.append("Ami banglay gan gai");
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        StringBuffer s2 = new StringBuffer("Welcome");

        System.out.println(s2.charAt(4));   //o
        s2.setCharAt(4,'o');
        System.out.println(s2);             //Welcome

        s2.deleteCharAt(4);
        System.out.println(s2);             //Welcme

        s2.append(" Tamzid");
        System.out.println(s2);            // Welcme Tamzid

        s2.insert(4,'o');
        System.out.println(s2);            //Welcome Tamzid

        s2.delete(8,14);
        System.out.println(s2);            //Welcome

        s2.append(true);
        System.out.println(s2);            //Welcome true

        s2.reverse();
        System.out.println(s2);            //eurt emocleW
    }
}
