import java.io.*;
class Hero
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String hero1, hero2;
        int h1,a1,f1,h2,a2,f2,t1,t2;
        hero1=br.readLine();
        h1=Integer.parseInt(br.readLine());
        a1=Integer.parseInt(br.readLine());
        f1=Integer.parseInt(br.readLine());
        hero2=br.readLine();
        h2=Integer.parseInt(br.readLine());
        a2=Integer.parseInt(br.readLine());
        f2=Integer.parseInt(br.readLine());
        t1=h1*10+a1*5+f1*(-5);
        t2=h2*10+a2*5+f2*(-5);
        if(t1>t2)
        {
            System.out.println(hero1+" is the best hero with"t1"points");
        }
        else
        {
            System.out.println(hero2+" is the best hero with"t2"points")
        }
    }
}
