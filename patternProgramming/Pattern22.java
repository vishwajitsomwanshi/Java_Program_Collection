package patternProgramming;

public class Pattern22
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;

        for (int i=1;i<=row;i++)
        {
            char k='A';
            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
            column--;
        }
    }
}
