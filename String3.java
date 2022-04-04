import java.io.*;
public class String3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1;
        int i, lowercase = 0, uppercase = 0, digit = 0, special = 0;
        input1 = br.readLine();

        char ch[] = input1.toCharArray();
        for(i = 0; i < ch.length; i++)
        {
            if(Character.isLowerCase(ch[i]))
                lowercase++;
            else if(Character.isUpperCase(ch[i]))
                uppercase++;
            else if(Character.isDigit(ch[i]))
                digit++;
            else
                special++;
        }
        System.out.println("lowercase = "+lowercase+" uppercase = "+uppercase+" digit = "+digit+" special = "+special);
    }
}
