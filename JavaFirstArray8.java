public class JavaFirstArray8
{
    public static void main(String[] args) {
        
        int    p[][] =  {
            //posibal in Only enhans for loop
            {32,65,98,98},
            {94,65},
            {87,5497}  
             };

        //posibal in Only enhans for loop
        for(int i[] : p)//follow this path for enhans for loop
        {
            for(int j : i)//follow this path for enhans for loop
            {
                System.out.print(j + "  ");
            }
                System.out.println("");
        }    


        //3D array is writing this methed
        /*
        for(int i[][] : p)//follow this path for enhans for loop
        {
            for(int j[] : i)//follow this path for enhans for loop
            {
                for(int k : j)
                {
                System.out.print(k + "  ");
                }
            }
                System.out.println("");
        }  
        */
        //3D array is writing this methed



    }
}
