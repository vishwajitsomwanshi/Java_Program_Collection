package patternProgramming;

public class Pattern39
{
    public static void main(String[] args)
    {
        int row=6;
        int column=1;
        int space=row-1;
        for (int i=1;i<=row-1;i++)
        {
            for (int j=1;j<=column;j++)
            {
               if (j==column-1||j==column-2)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
            column++;
        }
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                if (j==column-1||j==column-2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            column--;
        }

    }
}
