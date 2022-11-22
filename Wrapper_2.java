import java.util.Scanner;


public class Wrapper_2
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Integer is the non primitive data type
        Integer i = Integer.valueOf("326598");//writing in the int,short,float,byte,char,boolean any primitive type are avible in this scope. 
        int a = i.intValue();
        System.out.println(a);
    }    
}
