public class JavaFirst4
{
    public static void main(String[] args)
    {  
        int a[]=new int[5];
        a[0]=5;
        a[1]=6;
        a[2]=7;
        a[3]=8;
        a[4]=9;
        //different types of writing this methed
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);    
        }
        //different types of writing this methed
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);    
        }
        //different types of writing this methed
        for(int i : a)
        {
            System.out.println(i);    
        }
        
    }
}
