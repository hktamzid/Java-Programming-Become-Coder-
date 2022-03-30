import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception
    {
        int a= 0, b = 1, c,n,i;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = S.nextInt();
        System.out.print(a+" "+b+" ");
        for(i = 3;i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
