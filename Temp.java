import java.io.*;
class Temp
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int temp;
        System.out.println("Enter the temperature: ");
        temp=Integer.parseInt(br.readLine());
        if(temp<0)
        {
            System.out.println("It's Freezing Temperature");
        }
        else if(temp>=0 && temp<10)
        {
            System.out.println("It's very cold Whether");
        }
        else if(temp >=10 && temp<20)
        {
            System.out.println("It's Cold Whether");
        }
        else if(temp>=20 && temp<30)
        {
            System.out.println("It's Normal Temperatre");
        }
        else if(temp>=30 && temp<40)
        {
            System.out.println("It's Hot Temperature");
        }
        else
        {
            System.out.println("It's very Tempearure");
        }
    }
}
