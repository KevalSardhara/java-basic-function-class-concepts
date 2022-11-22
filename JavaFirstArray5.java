import java.util.Random;

public class JavaFirstArray5
{
    public static void main(String[] args)
    {
        int  a[] = new int[5];
        System.out.println("----------------------------------------------");
        for(int i=0;i<5;i++)
        {
            a[i]=i+1+1+1+1;
        }
        System.out.println("----------------------------------------------");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------------------");
        for(int i : a)
        {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        Random r=new Random();
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt(100);//'5' is the last value of out of 1 to 5.//in random values are hear
        }
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        for(int i : a)
        {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");




        System.out.println("-----------------most pawerfull information----------------------------");
        try
        {
            System.out.println(a[102]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of range");
        }
        System.out.println("-----------------most pawerfull information----------------------------");




        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
