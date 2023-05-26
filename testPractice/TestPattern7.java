package testPractice;

public class TestPattern7
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        for (int i=1;i<=row;i++)
        {
            int k=0+i;
            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k++;
                if (k>5)
                {
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
