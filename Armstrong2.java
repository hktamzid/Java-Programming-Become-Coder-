import java.util.Scanner;

public class Armstrong2 
{
    public static void main(String[] args) throws Exception
    {
        Scanner S = new Scanner(System.in);
        int n,r, temp, count, sum = 0;
        n = S.nextInt();

        count = (int)Math.log10(n)+1;
        System.out.println("No of digits = "+count);

        while(n>0)
        {
            r = n %10;
            sum = sum + (int)Math.pow(r,count);
            n = n / 10;
        }
        if(sum == temp)
            System.out.println(temp+" is Armstrong Number");
        else
        {
            System.out.println(temp+" is not Armstrong Number");
        }
    }    
}
