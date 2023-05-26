package patternProgramming;

public class
Pattern40
{
    public static void main(String[] args)
    {
       int row=5;
       int column=5;
       for (int i=1;i<=row;i++)
       {
           for (int j=1;j<=column;j++)
           {
               if(i==2||i==4||j==2||j==4)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
