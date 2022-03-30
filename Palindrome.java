import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)throws Exception
    {
        int temp, rem, n, sum = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = S.nextInt();
        temp = n;
        while(temp!=0)
        {
            rem = n%10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if( sum == temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    
}

