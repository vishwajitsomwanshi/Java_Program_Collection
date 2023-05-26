package patternProgramming;

public class Pattern19
{
    public static void main(String[] args)
    {
       int row=5;
       int column=5;
        int k=5;
        int x=4;
        int y=4;
        int z=5;
       for (int i=1;i<=row;i++)
       {
           for (int j=1;j<=column;j++)
           {
               if(j==1)
               {
                   System.out.print(z+" ");
               }
               else
               {z=z+y;
               System.out.print(z+" ");
               y--;}
           }
           y=+4;
           z=x;
          x--;
           System.out.println();
           column--;
       }
    }
}
