import java.io.*;
class Main
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double a,b,c,root1,root2;
        a=Double.parseDouble(br.readLine());
        b=Double.parseDouble(br.readLine());
        c=Double.parseDouble(br.readLine());
        double determinant = b * b - 4 * a * c;

        if(determinant > 0)
        {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b + Math.sqrt(determinant)) / (2 * a);

            System.out.println("root1 = %.2f and root = %.2f",root1,root2);
        }

        else if(determinant == 0)
        {

            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 = %.2f",root1);
        }
        else
        {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.println("root1 = %.2f+%2fi",real,imaginary);
            System.out.println("root1 = %.2f-%.2fi",real,imaginary);
        }
    }
}
