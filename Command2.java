
public class Command2
{
    public static void main(String[] args)
    {
        
        System.out.println("Welcome back to my java program");
        //This program is working only command line black run in our compute program so
        //writing methed is the i give and follow us Thunk You!
        //drive_name:\>cd javac file_name.java
        //Command line argument
        //drive_name:\>java file_name India  is   my    Country //writing method is this scope
        //                  args--->  [0]    [1]  [2]     [3]
        System.out.println(args[0]);
        System.out.println(args[1]);

        //passing 1 and more then argument pass and that time using the args.length;

        for(int i = 0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        for(String i : args)
        {
            System.out.println(i);
        }

        //sum time is the working is the convert to the Integer.valueOf()//Integer.parseInt//

        
        for(int i = 0;i<args.length;i++)
        {
            int a = Integer.parseInt(args[i]);//This is the proper way of writing method;
            String b = String.valueOf(args[i]);//Any Veriable Writing in This scope.float/short/int/char/String any;
            //Any Veriable Writing in This scope.float/short/int/char/String any;
            System.out.println(a);
            System.out.println(b);
        }
        for(int i : args)
        {
            System.out.println(i);
        }
    }    
}
