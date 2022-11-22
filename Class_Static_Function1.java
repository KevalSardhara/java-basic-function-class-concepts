//---------------------------------Right-------------------------------------------------

import java.util.Scanner;
public class Class_Static_Function1
{
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
    
    Car c1 = new Car();
    Car c2 = new Car();
    Car c3 = new Car();
    Car c4 = new Car();
     /*
     c1.a=32;
     c1.b=65;
     c1.c=99;   
    */
    int x,y,z;
//---------------------------------------------------------------------------------------
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    c1.getdata(x,y,z);
    c1.show_value();
//---------------------------------------------------------------------------------------
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    c2.getdata(x,y,z);
    c2.show_value();
//---------------------------------------------------------------------------------------
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    c3.getdata(x,y,z);
    c3.show_value();
//---------------------------------------------------------------------------------------

    c4=c3.sumdata(c1,c2);
    c4.show_value();

    }
}


class Car
{
    //private int a,b,c;//private value is the not decler in the main function
    public int a,b,c;

    public void getdata(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    public Car sumdata(Car c1,Car c2)
    {
        Car cc = new Car();
        cc.a=a+c1.a+c2.a;
        cc.b=b+c1.b+c2.b;
        cc.c=c+c1.c+c2.c;
        return cc;
    }
    public void show_value()
    {
        System.out.println("sum "+ (a+b+c) + " value " + a + " " + b + " " + c);
    }
}