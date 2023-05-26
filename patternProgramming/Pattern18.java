package patternProgramming;

public class Pattern18
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;

        for (int i=1;i<=row;i++)
        {
            char k='E';
            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
            column++;
        }
    }
}
