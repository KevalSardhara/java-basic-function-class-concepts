import java.util.Scanner;

public class Class_Static_Function2
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String p= new String("INDIA 2021 Welcome");
        System.out.println(p);
        String s;
        
        s = sc.nextLine();
        int a = sc.nextInt();
        float b = sc.nextFloat();
        String  c = sc.next();
        data(s,a,b,c);
    }
    static void data(String s,int a,float b,String c)
    {
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
