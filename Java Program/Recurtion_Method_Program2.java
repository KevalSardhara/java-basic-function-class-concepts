import java.util.Scanner;

public class Recurtion_Method_Program2
{
    public static void main(String[] args) {
        
        System.out.println("Keval Sardhara");

        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int v;
        System.out.println("enter size of array");
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("passing the key value");

        int key = sc.nextInt();
        int callect = passingVlue(a,n,key);
        System.out.println(callect);
    }
    public static int passingVlue(int a[],int n,int key)
    {
        if (n==-1)
        {
            return -1;
        }
        if (a[n]==key)
        {
            return n;
        }
        return passingVlue(a,n-1,key);   
    }
}
