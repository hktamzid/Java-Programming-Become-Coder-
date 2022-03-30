import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)throws Exception
    {
        int temp, rem, n, sum = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = S.nextInt();
        temp = n;
        while(temp!=0)
        {
            rem = temp%10;
            sum = sum + rem*rem*rem;
            temp = temp / 10;
        }
        if( sum == n)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
    
}
