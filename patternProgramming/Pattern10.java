package patternProgramming;

public class Pattern10
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        int k=1;
        for (int i=1;i<=row;i++)
        {

            for (int j=1;j<=column;j++)
            {
                if (i%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(k);
                }

            }
            System.out.println();
            column++;
            k++;
        }
    }
}
