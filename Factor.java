import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factor 
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int prod = 1;
        int sum = 0,n,i; 
        n = Integer.parseInt(br.readLine());
        for(i = 1; i <= n; i++)
        {
            if(n%i==0)
            {
                prod = prod * i;
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println(prod);
    }
}
