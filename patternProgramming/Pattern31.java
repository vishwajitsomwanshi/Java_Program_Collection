package patternProgramming;

public class Pattern31
{
    public static void main(String[] args)
    {
     int row=5;
     int column=1;
     int space=row-1;
     char a='A';
     for (int i=1;i<=row;i++)
     {
         for (int k=0;k<space;k++)
         {
             System.out.print(" ");
         }
         for (int j=1;j<=column;j++)
         {
             System.out.print(a);
         }
         a++;
         System.out.println();
         column++;
         space--;
     }
    }
}
