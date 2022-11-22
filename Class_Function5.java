import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;
public class Class_Function5
{
    public static void main(String[] args) 
    {
        System.out.println("Keval Sardhara");
        Scanner p= new Scanner(System.in);

        String s=new String("Welcome 2021");
        System.out.println(s);
        
        String c;
        boolean b;

        c= p.nextLine();
        //p.nextLine();
        //Information about the all String time Write it now this method every time because of this is the buffer.
        b= p.nextBoolean();

        Welcome w1 = new Welcome();
        Welcome w2 = new Welcome();
        w1.inputdata(c,b);

        p.nextLine();//Information about the all String time Write it now this mwthod every time because of this is the buffer.
        c= p.nextLine();
        
        b= p.nextBoolean();

        w2.inputdata(c,b);

        w2.outputdata(w1);
    }    
}
class Welcome
{
    String a;
    boolean d;

    public void inputdata(String c,boolean b)
    {
        a=c;
        d=b;
    }

    public void outputdata(Welcome w1)
    {
        System.out.println("1 " + w1.a + " " + w1.d);
        System.out.println("2 " + a + " " + d);
    }
}