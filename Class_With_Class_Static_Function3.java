import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class Class_With_Class_Static_Function3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        String y;
        int m;
        m = sc.nextInt();
        Programming p1 = new Programming();
        Programming.calling(m);

        p1.print();

        int e,f,g,h,i;
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        i = sc.nextInt();
        System.out.println("-----------------------------");
        p1.arrayprint(e,f,g,h,i);
    }    
}
class Programming
{
    int a;
    String b;
    static int s;

    public static void calling(int m)
    {
        s=m;//Only write it the static value because of this is the sattic function excces.
    }
    public void print()
    {
        System.out.println(s);
    }

    public void arrayprint(int ...e)
    {
        for(int n : e)
        {
            System.out.println(n);
        }
    }
}
