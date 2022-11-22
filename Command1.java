import java.util.Scanner;


public class Command1
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = "INDIA";
        System.out.println(s.length());

        int i1 = Integer.valueOf("123");
        float i2 = Float.valueOf("123");
        String str = String.valueOf("Ke");
        double d = Double.valueOf("3265.3265");
        int i = Integer.valueOf("1001110101",2);//convert to the binary formetion denoted the 2 is denoted binary.
        //------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(str);
        System.out.println(d);
        System.out.println(i);
    }    
}
