import java.util.Scanner;
public class JavaFirst3
{
    public static void main(String[] args)
    {
        System.out.println("HELLO WORLD");
        Scanner p=new Scanner(System.in);
        System.out.println("---------1----------");
        String a=p.next();
        System.out.println(a);
        System.out.println("---------2----------");
        String b=p.nextLine();
        System.out.println(b);
        System.out.println("---------3----------");
        int c=p.nextInt();
        System.out.println(c);
        System.out.println("---------4----------");
        String d=p.next();
        System.out.println(d);
        System.out.println("---------5----------");
        long s=p.nextLong();
        System.out.println(s);
        System.out.println("---------6----------");
    }    
}
