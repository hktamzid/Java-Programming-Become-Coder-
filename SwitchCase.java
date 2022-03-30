import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        char = s.nextLine();
        switch(ch)
        {
            case 'A' || 'a':
            case 'E' || 'e':
            case 'I' || 'i':
            case 'O' || 'u':
            case 'u' || 'u':
                System.out.println("Vowel");
                break;
            default:
            System.out.println("Not Vowel");
        }
    }
    
}
