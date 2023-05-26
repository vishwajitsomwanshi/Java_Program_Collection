package patternProgramming;

public class Pattern30
{
    public static void main(String[] args)
    {
     int row=4;
     int column=1;
     int space=row-1;
        int z=1;
     for (int i=1;i<=row;i++)
     {

         for (int k=0;k<space;k++)
         {
             System.out.print(" ");
         }
         for (int j=1;j<=column;j++)
         {

             System.out.print(z);
             z++;
         }
         System.out.println();
         column++;
         space--;
       }
    }
}
