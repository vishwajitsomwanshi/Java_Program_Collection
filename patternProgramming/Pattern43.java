package patternProgramming;

public class Pattern43
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (i==2||j==2||i==j||i+j==4)
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
