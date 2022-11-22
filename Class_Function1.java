public class Class_Function1
{
    public static void main(String[] args)
    {
        int a=121;
        int b=131;
        int c=145;
        int d=189;
        System.out.println("Hello Hiiii");
        Google g1 = new Google();

        g1.showdata(a,b,c,d);
        g1.getdata(a,b,c,d);
        g1.printdata();

    }   
}
class Google
{
    int w;
    int x;
    int y;
    int z;

        public void showdata(int a,int b,int c,int d)
        {

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println("Hello Hiiii");

            /*
            for(int i : a)
            {
            System.out.println(i);
            }
            */

        }    
        
        public void getdata(int a,int b,int c,int d)
        {
            w=a;
            x=b;
            y=c;
            z=d;
        }

        public void printdata()
        {
            System.out.println(w);
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
}
