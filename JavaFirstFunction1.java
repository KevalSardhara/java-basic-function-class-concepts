import java.util.Scanner;

//import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

public class JavaFirstFunction1
{
    public void fun()//(int a,int b)
    {
        //System.out.println("your value"+a+" "+"and "+b);
        System.out.println("your value");
    }

    public void getdata(int a,int b)//(int a,int b)
    {
        System.out.println("your value"+a+" "+"and "+b);
        int sum=a+b;
        sumsum(sum);
    }
    public void sumsum(int sum)
    {
        System.out.println(sum);
    }
    
    public static void main(String[] args)
    {   //your saveing file name write hear
        JavaFirstFunction1 g1 = new JavaFirstFunction1();
        int a=10;
        int b=20;
        g1.fun();
        g1.getdata(a,b);
        g1.sumsum(a+b);
        int c;
        c=121;
        System.out.println(c);
    }
}
