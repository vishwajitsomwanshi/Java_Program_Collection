package testPractice;

public class TestPattern14
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        for (int i=1;i<=row;i++)
        {
            int k=0+i;
            for (int j=1;j<=column;j++)
            {
                System.out.print(k);
                k+=5;
            }
            System.out.println();
            column++;
        }
    }
}
