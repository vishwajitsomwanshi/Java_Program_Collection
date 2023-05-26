package patternProgramming;

public class Pattern23
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        char k ='E';
        for (int i=1;i<=row;i++)
        {

            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
            k= (char) ('E'-i);
            column--;

        }
    }
}
