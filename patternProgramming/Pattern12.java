package patternProgramming;

public class Pattern12
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
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
            column++;
        }
    }
}
