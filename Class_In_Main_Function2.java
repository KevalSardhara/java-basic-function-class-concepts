import java.util.Scanner;


public class Class_In_Main_Function2
{
    public static void main(String[] args)
    {    
        System.out.println("India Is My country");
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        sc.nextLine();
        float q= sc.nextFloat();
        sc.nextLine();
        String r = sc.nextLine();
        Orecal o1 = new Orecal();
        Orecal.Company c1 = o1.new Company();

        o1.getData(p,q,r);
        
        boolean t =sc.nextBoolean();
        char u = 'K';
        c1.putData(p,t,u);

        o1.showData();
        c1.comeData();
    }    
}



class Orecal
{
    int a;
    float b;
    String s;

    public void getData(int p,float q,String r)
    {
        a=p;
        b=q;
        s=r;
    }

    public void showData()
    {
        System.out.println(a+" "+b+" "+s);
    }
    class Company
    {

        int x;
        boolean y;
        char z;
        
        public void putData(int p,boolean t,char u)
        {
            x=p;
            y=t;
            z=u;
        }

        public void comeData()
        {
            System.out.println(x+" "+y+" "+z);
        }

    }
}