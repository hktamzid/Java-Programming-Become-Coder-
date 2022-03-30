import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) 
    {
        int num;
        System.out.print("Enter a value: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        System.out.println("The number is "+num);
    }
}
