import java.util.Scanner;

import java.io.*;
public class Color {
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char code;
        System.out.print("Enter a color code: ");
        code =(char)br.read();
        switch(code)
        {
            case 'R':
                System.out.println("Red");
                break;
            case'G':
                System.out.println("Green");
                break;
            case'B':
                System.out.println("Blue");
                break;
            case'Y':
                System.out.println("Yellow");
                break;
            case'V':
                System.out.println("Violet");
                break;
            case'O':
                System.out.println("Orrange");
                break;
            case'I':
                System.out.println("Indigo");
                break;
            default:
                System.out.println("Enter a valid code");
        }


    }
    
}
