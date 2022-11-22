import java.util.Scanner;

import org.graalvm.compiler.lir.StandardOp.ZapRegistersOp;

public class Class_Perent_Child_extend1
{
    public static void main(String[] args)
    {
        
        System.out.println("State");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c= sc.nextLine();
        sc.nextLine();
        
        int m = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        

        Sport_Bike s1 = new Sport_Bike();
        s1.setEngin(a);
        s1.setPetrol_Tenk(b);
        s1.setSwitch(c);
        s1.setExtra_High_Speed(m);
        s1.setSecound_Sileson(n);
//------------------------------------------------------------------------
        s1.Engin();
        s1.Petrol_Tenk();
        s1.Switch();
        s1.Extra_High_Speed();
        s1.Secound_Sileson();
    }
}
class Bike
{

    int x;
    int y;
    String z;
    public void setEngin(int a)
    {
        x=a;
    }
    public void setPetrol_Tenk(int b)
    {
        y=b;
    }
    public void setSwitch(String c)
    {
        z=c;
    }


//--------------------------------------------------------------------------



    public void Engin()
    {
        System.out.println("Engine = " + x);
    }
    public void Petrol_Tenk()
    {
        System.out.println("Petrol tenk = " + y);
    }
    public void Switch()
    {
        System.out.println("Switch = " + z);
    }

}
class Sport_Bike extends Bike
{

    int p;
    String q;
    public void setExtra_High_Speed(int m)
    {
        p=m;
    }
    public void setSecound_Sileson(String n)
    {
        q=n;
    }

//--------------------------------------------------------------------------


    public void Extra_High_Speed()
    {
        System.out.println("Extra High Speed = " + p);
    }
    public void Secound_Sileson()
    {
        System.out.println("Secound Sileson = " + q);
    }
}