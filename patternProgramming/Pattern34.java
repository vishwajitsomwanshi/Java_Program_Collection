package patternProgramming;

public class Pattern34
{
    public static void main(String[] args)
    {
        int row=6;
        int column=1;
        int space=row-1;
        for (int i=1;i<=row;i++)
        {
            for (int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=column;j++)
            {
                if (j==(column)||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            column+=2;
            space--;
        }
    }
}
