import java.io.*;
class Demo
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x,y;
        System.out.println("Enter two numbers: ");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());

        if(x>y)
        {
            System.out.println(x+"is biggest");
        }
        else
        {
            System.out.println(y+"is biggest");
        }
        //System.out.println("");
    }
}
