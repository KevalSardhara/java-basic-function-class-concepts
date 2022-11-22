import java.util.Scanner;

public class New_Array_Method2
{
    public static void main(String[] args) {
        
        System.out.println("Keval Sardhara");
        Scanner sc = new Scanner(System.in);

        Pass p1 = new Pass();
        p1.getData(new int [] {10,20,30,40,50,60});
        p1.getData(new int [] {10,20,30,40,50,60});
        

    }    
}

class Pass
{
    public void getData(int[] n)//(int... n)//(var..rag)veriable
    {
        System.out.println("----------------------------------");

        for(int i : n)
        {
            System.out.println(i);
        }

        System.out.println("----------------------------------");
    }
}


  /*
    public void getData(int...n)//(var..rag)veriable
    {
        for(int i : n)
        {
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        for(int j : n)
        {
            System.out.println(j);
        }
    }
    */
        /*
        public void getData(int ... n)//(var..rag)veriable
        {
            for(int i : n)
            {
                System.out.println(i);
            }
        }
        */
        /*
        public void getData(int...n)//(var..rag)veriable
        {
            for(int i : n)
            {
                System.out.println(i);
            }

            for(int j : n)
            {
                System.out.println(j);
            }
        }
        */
