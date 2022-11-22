import java.util.Scanner;

public class New_Array_Method3
{
    public static void main(String[] args) {
        
        System.out.println("InDiA");
        Scanner sc = new Scanner(System.in);

        
        int a[] = new int[100];
        int n = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        Student s1 = new Student();
        Student.m1(new int[] {10,20,30,40,50});
    }    
}

class Student
{
    public static void m1(int[] n)
    {
        for(int i : n)
        {
            System.out.println(i);
        }
    }
}