import java.util.Scanner;


public class Class_With_Class_Static_Function5
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Class_With_Class_Static_Function5 g1 = new Class_With_Class_Static_Function5();
        Class_With_Class_Static_Function5.passing(x,y);
    }    

    static class Class_With_Class_Static_Function5
    {
    
        public static void passing(int x,int y)
        {
            Systeam.out.println(x+y);
        }
    }
}
