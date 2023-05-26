package patternProgramming;

public class Pattern25
{
    public static void main(String[] args)
    {
        int row=5;
        int column=2;
        int k =1;
        for (int i=0;i<row;i++)
        {

            for (int j=0;j<column;j++)
            {
                if (i%2==0)
                {
                    System.out.print(k);
                }
                else
                    System.out.print("*");
            }
            if (i%2==0)
            {
                k++;
            }
            System.out.println();
            column++;
            }
    }
}
