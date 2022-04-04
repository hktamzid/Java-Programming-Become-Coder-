import java.io.*;
public class String2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1, input2;
        input1 = br.readLine();
        input2 = br.readLine();

        if(input1.contains(input2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
