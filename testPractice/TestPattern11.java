package testPractice;

public class TestPattern11
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        for(int i=1;i<=row-1;i++)
        {
            for (int j=1;j<=column;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            column--;
        }
        for(int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            column++;
        }
    }

}
