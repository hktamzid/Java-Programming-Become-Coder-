import java.io.*;
public class String5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2 = "";
        int digit = 0, sum = 0;
        str1 = br.readLine();

        char ch[] = str1.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            //if(Character.isLetter(ch[i]));
                           //str2 = str2 + ch[i];
            if(Character.isDigit(ch[i]))
            //digit++;
            sum = sum + Integer.parseInt(ch[i]+"");
            //sum = sum + (ch[i]-48);
        }
        //System.out.println(str2);
        System.out.println(sum);
    }
}
