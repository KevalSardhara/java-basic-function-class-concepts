import java.util.Random;

public class JavaFirstArray7
{
    public static void main(String[] args)
    {
        /*-----------------------------------------------------------------------------------------------

        int a[][] = new int[3][3];
        a[0][0] = 989;
        a[0][1] = 325;
        a[0][2] = 989;
        a[1][0] = 325;
        a[1][1] = 189;
        a[1][2] = 325;
        a[2][0] = 989;
        a[2][1] = 325;
        a[2][2] = 325;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }

        int    p[][] = {
                         {32,65,98,98},
                         {94,65,89,97},
                         {87,54,21,97}  
                       };

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
            System.out.print(p[i][j] + "  ");
            }
            System.out.println("");
        }
        -------------------------------------------------------------------------------------------------
        */
        /*
        -------------------------------------------ERROR-------------------------------------------------
        
        int    p[][] = {
                             {32,65,98,98},
                             {94,65,97},
                             {21,97}  
                       };
        
        -------------------------------------------------------------------------------------------------
        */
        /*
        ---------------------------------Right---------------------------------------------------------------
  
        int    p[][] =  {
                            {32,65,98,98},
                            {94,65,89,97},
                            {87,54,21,97}  
                        };
                       for(int i=0;i<3;i++)
                       {
                           for(int j=0;j<4;j++)
                           {
                           System.out.print(p[i][j] + "  ");
                           }
                           System.out.println("");
                       }
        */

        //---------------------------Right and enhans for loop----------------------------------------------------------------------
  


         int    p[][] =  {
                        {32,65,98,98},
                        {94,65,89,97},
                        {87,54,21,97}  
                         };

                   for(int i=0;i<3;i++)
                   {
                       for(int j=0;j<4;j++)
                       {
                       System.out.print(p[i][j] + "  ");
                       }
                       System.out.println("");
                   }
                   System.out.print("\n");
        for(int i[] : p)//follow this path for enhans for loop
        {
            for(int j : i)//follow this path for enhans for loop
            {
                System.out.print(j + "  ");
            }
            System.out.println("");
        }  
        
    }    
}
