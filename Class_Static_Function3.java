import java.util.Scanner;

public class Class_Static_Function3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int v=passdata(a,b,c);
        showvalue(v);
    }
    
    static int passdata(int a,int b,int c)
    {
        int p,q,r;
        int value;
        p=a;
        q=b;
        r=c;
        value=passing(p,q,r);
        return value;
    }

    static int passing(int p,int q,int r)//Make the static function.
    {
        int sum;
        sum=p+q+r;
        return sum;
    }

    static void showvalue(int v)
    {
        System.out.println(v);
    }
}
