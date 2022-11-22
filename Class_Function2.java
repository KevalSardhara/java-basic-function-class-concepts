import java.util.Scanner;

public class Class_Function2
{
    public static void main(String[] args) {
        String s= new String("Hiiii Hello");
        System.out.println(s);

        Scanner sc=new Scanner(System.in);
        Google g1=new Google();

        int x=sc.nextInt();
        int y=sc.nextInt();


        g1.getdata(x,y);
        g1.showdata();
        //-----------------------------------------------------------------------------
        Scanner p=new Scanner(System.in);
        Apple a1=new Apple();

        int c = p.nextInt();
        int d = p.nextInt();

        a1.enterdata(c,d);
        a1.finddata();
    }    
}

class Google
{
    int a,b;
    public void showdata()
    {
        System.out.println("Welcome to Google HeadQuater\n");
    }

    public void getdata(int x,int y)
    {
        System.out.println("your data " + x + " your secound data " + y);
        System.out.println(x+y);
    }

}


class Apple
{
    int p,q;
    public void enterdata(int m,int n)
    {
        p=m;
        q=n;
    }
    public void finddata()
    {
        System.out.println("your data " + p + " your secound data " + q);
        System.out.println(p+q);
    }
}