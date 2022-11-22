import java.util.Scanner;


public class Wrapper_1
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //parseXxx();//most important Wrapper class
        int a = Integer.parseInt("123");
        float i2 = Float.parseFloat("123.3");
        //String str = String.parseString("Ke");
        double d = Double.parseDouble("3265.3265");


        
        System.out.println(a);
        System.out.println(i2);
        //System.out.println(str);
        System.out.println(d);
    }    
}
