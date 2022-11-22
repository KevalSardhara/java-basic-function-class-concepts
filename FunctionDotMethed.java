public class FunctionDotMethed 
{
    public static void main(String[] args)
    {
        int a=121;
        int b=131;
        int c=145;
        int d=189;
        System.out.println("Hello Hiiii");
        Google g1 = new Google();
        //g1.getdata();
        g1.showdata(a,b,c,d);
    }   
}
class Google
{
    //int a,b,c;

        public void showdata(int ...a)
        {
            for(int i : a)
            {
            System.out.println(i);
            }
        }
}