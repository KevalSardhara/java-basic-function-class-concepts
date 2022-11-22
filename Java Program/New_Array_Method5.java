import java.util.Scanner;
//---------------------------------------2D and 3D Array-----------------------------------------------//
public class New_Array_Method5
{
    public static void main(String[] Keval)//(String[] args)//(String...args)//Right Methhod For This is
    {
        System.out.println("Keval Sardhara");
        Scanner sc = new Scanner(System.in);

        String s = new String("JSK");
        System.out.println(s);
        //---------------------------------------2D Array-----------------------------------------------//
        passIng(new int[][] {{1,2,3},{10,20,30},{100,200,300}});
        //---------------------------------------3D Array-----------------------------------------------//
        pass(new int[][][] {{{1,2,3},{10,20,30},{100,200,300}},{{12,13,14},{45,56,78},{14,65,99}}});
    }   
    public static void passIng(int[]...n)//(int n[][])
    {
        for(int i[] : n)
        {
            for(int j : i)
            {
                System.out.print("   "+j);
            }
            System.out.println("\n");
        }
    } 
    public static void pass(int[][]...m)//(int m[][][])
    {
        for(int i[][] : m)
        {
            for(int j[] : i)
            {
                for(int k : j)
                {
                    System.out.print("   "+k);
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    } 
}
