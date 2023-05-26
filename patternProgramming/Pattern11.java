package patternProgramming;

public class Pattern11
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;

        for (int i=1;i<=row;i++)
        {
            int k=1;
            for (int j=1;j<=column;j++)
            {
                if (j%2==0)
                {
                    System.out.print("*");
                    k+=2;
                }
                else
                {
                    System.out.print(k);
                }

            }

            System.out.println();
            column++;

        }
    }
}
