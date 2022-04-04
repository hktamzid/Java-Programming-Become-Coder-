import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        StringBuffer sb1;
        str1 = br.readLine();

        String words[] = str1.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            sb1 = new StringBuffer(words[i]);
            System.out.println(sb1.reverse()+" ");
        }
    }
}
