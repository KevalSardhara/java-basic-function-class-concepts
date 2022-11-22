import java.util.Scanner;
import java.util.Random;

public class New_Array_Method1
{
    public static void main(String[] args) {
        
        System.out.println("Keval Sardhara");
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();

        int a = sc.nextInt();
        int b = r1.nextInt(12);
        int c = r1.nextInt(123);
        int d = r1.nextInt(12);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }    
}
