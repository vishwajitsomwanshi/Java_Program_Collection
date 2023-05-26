package patternProgramming;

public class Pattern24
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        char k ='E';
        for (int i=1;i<=row;i++)
        {
            k= (char) ('E'+i);
            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
            column--;
        }
    }
}
