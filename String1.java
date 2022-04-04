import java.io.*;
public class String1 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String input;
        input = br.readLine();
        String words[] = input.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            System.out.println("WOrd"+(i+1)+" - "+words[i].length());
        }
    }
}
