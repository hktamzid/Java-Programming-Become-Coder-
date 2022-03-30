import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char ch;
        System.out.print("Enter a Capital Letter ");
        ch =(char)br.read();
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
            System.out.println("Not Vowel");
        }
    }
    
}
