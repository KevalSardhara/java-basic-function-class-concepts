import java.util.Scanner;

public class Class_With_Class_Static_Function4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Form f1 = new Form();
        String st = sc.nextLine();
        Form.call(st);
        Form.seendata();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        Form.Page.data(i,j,k);
        Form.Page.show();
    }    
}
class Form
{
    int x;
    static String s;

    static class Page
    {
        static int a,b,c;
        public static void data(int i,int j,int k)
        {
            a=i;
            b=j;
            c=k;
        }
        public static void show()
        {
            System.out.println(a+b+c);
        }
    } 
    public static void call(String st)
    {
        s=st;
    }

    public static void seendata()
    {
        System.out.println(s);
    }
}
