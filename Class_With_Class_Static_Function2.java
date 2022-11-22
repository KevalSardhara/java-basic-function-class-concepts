dimport java.util.Scanner;

public class Class_With_Class_Static_Function2
{
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        Fine f1 = new Fine();
        Fine f2 = new Fine();

        f2=f1.passdata(x,y,z);
        //int s=pass(x,y,z);
        //System.out.println(s);

        //int com = seen(f2);

        //System.out.println(com);

        if(seen(f2)==pass(x,y,z))
        {
            System.out.println("Sucssesfull Program Run");
        }
        else
        {
            System.out.println("Not Sucssesfull Program Run");
        }
    }
    
    static int pass(int x,int y,int z)
    {
        int sum = x+y+z;
        return sum;
    }

    static int seen(Fine f2)
    {
        int su = f2.a + f2.b +f2.c;
        return su;
    } 
}



class Fine
{
    public int a,b,c;

    public Fine passdata(int x,int y,int z)
    {
        Fine ff = new Fine();
        ff.a=x;
        ff.b=y;
        ff.c=z;
        return ff;
    }

//   public void comper(int s,int com)
//   {
//       if(s==com)
//       {
//           System.out.println("Sucssesfull Program Run");
//       }
//       else
//       {
//           System.out.println("Not Sucssesfull Program Run");
//       }
//   }

}