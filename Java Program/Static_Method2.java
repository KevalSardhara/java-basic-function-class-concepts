public class Static_Method2
{
    static
    {
        System.out.println("static");//First Print
    }
    public static void main(String[] args) {
        System.out.println("main");//Secound Print
        String s = new String();
        System.out.println(s.length());
    }    
}
