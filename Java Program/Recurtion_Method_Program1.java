//import java.security.Key;
import java.util.Scanner;


public class Recurtion_Method_Program1
{
    public static void main(String[] args) {
        
        System.out.println("Keval Sardhara");

        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int p = 0;
        int v;
        System.out.println("enter size of array");
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("passing the key value");

        int key = sc.nextInt();
        int callect = passingVlue(a,n,p,key);
        System.out.println(callect);
    }    

    public static int passingVlue(int a[],int n,int p,int key)
    {
        if (n==p)
        {
            return 0;
        }
        if (a[p]==key)
        {
            return p;
        }
        return passingVlue(a,n,p+1,key);   
    }
}
