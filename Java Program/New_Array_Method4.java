import java.util.Scanner;

public class New_Array_Method4
{
    public static void main(String[] args) {
        
        System.out.println("State");

        Scanner sc = new Scanner(System.in);
        Pytem p1 = new Pytem(new int[] {1,2,3,4,5});
        Pytem p2 = new Pytem(new int[] {10,20,30,40,50});
        
    }    
}


class Pytem
{
    /*-----------------------Right Method For All Method---------------------------*/
    /*
    public Pytem(int ...n)
    {
        for(int i : n)
        {
            System.out.println(i);
        }
    }
    */
    /*
    public Pytem(int[] n)
    {
        for(int i : n)
        {
            System.out.println(i);
        }

    }
    */
    public Pytem(int n[])
    {
        for(int i : n)
        {
            System.out.println(i);
        }

    }
}
