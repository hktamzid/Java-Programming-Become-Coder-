import java.io.*;
class Employee
{
    public static void main(String[] args)throws Exception
    {
        int racer1,racer2,racer3,racer4,racer5;
        float average;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the speed of Racer 1: ");
        racer1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the speed of Racer 2: ");
        racer2 = Integer.parseInt(br.readLine());
        System.out.println("Enter the speed of Racer 3: ");
        racer3 = Integer.parseInt(br.readLine());
        System.out.println("Enter the speed of Racer 4: ");
        racer4 = Integer.parseInt(br.readLine());
        System.out.println("Enter the speed of Racer 5: ");
        racer5 = Integer.parseInt(br.readLine());

        average = (racer1+racer2+racer3+racer4+racer5)/5;
        if(racer1 >= average)
            {
                System.out.println(racer1+" Congrats! you are qualified");
            }
        if(racer2 >= average)
        {
            System.out.println(racer2+" Congrats! you are qualified");
        }
        if(racer3 >= average)
        {
            System.out.println(racer3+" Congrats! you are qualified");
        }
        if(racer4 >= average)
        {
            System.out.println(racer4+" Congrats! you are qualified");
        }
        if(racer5 >= average)
        {
            System.out.println(racer5+" Congrats! you are qualified");
        }
        else
        {
            System.out.println("You are not qualified");
        }
    }
}



