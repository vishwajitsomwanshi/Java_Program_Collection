package patternProgramming;

public class
Pattern36
{
    public static void main(String[] args)
    {
        int row=4;
        int column=1;
        for (int i=1;i<=row-1;i++)
        {
            for (int j=1;j<=column;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            column++;
        }
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            column--;
        }

    }
}
