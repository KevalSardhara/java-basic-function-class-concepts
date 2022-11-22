import java.util.Scanner;


public class Class_In_Main_Function1
{
    class Box
    {
        int x,y;
        float z;
    
        public void getinfo(int a,int b,float c)
        {
            x=a;
            y=b;
            z=c;
        }
        public void showinfo()
        {
            System.out.println(x+" "+y+" "+z);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("India");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b=  sc.nextInt();
        float c = sc.nextFloat();
        
        Class_In_Main_Function1 c1 = new Class_In_Main_Function1();
        Class_In_Main_Function1.Box b1 = c1.new Box();
        b1.getinfo(a,b,c);
        b1.showinfo();

    }    


}
//-----------------------------------Right------------------------------------//

//class Box
//{
//    int x,y;
//    float z;
//
//    public void getinfo(int a,int b,float c)
//    {
//        x=a;
//        y=b;
//        z=c;
//    }
//    public void showinfo()
//    {
//        System.out.println(x+" "+y+" "+z);
//    }
//}