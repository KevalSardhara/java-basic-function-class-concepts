import java.util.Scanner;

public class Class_Function4
{
    public static void main(String[] args) {
        System.out.println("keval");
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        a= sc.nextInt();
        b= sc.nextFloat();

        Microsoft g1 = new Microsoft();
        g1.get(a,b);
        System.out.println("Hello");
        g1.show();
    }    
}

class Microsoft
{
    public int x;
    public float y;

    public void get(int a,float b)
    {
        x=a;
        y=b;
    }
    public void show()
    {
        System.out.println(x+y);
    }
}
