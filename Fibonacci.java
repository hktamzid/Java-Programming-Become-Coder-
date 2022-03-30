import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception
    {
        int a= 0, b = 1, c,n,i, sum = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = S.nextInt();
        System.out.print(a+" "+b+" ");
        c = a + b;
        while(c <= n)
        {
            if(c%2==0)
                sum = sum + c;
            a = b;
            b = c;
            System.out.print(c+" ");
            c = a + b;
        }
        System.out.println("\n"+sum);

        /*for(i = 3;i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }*/
    }
}
