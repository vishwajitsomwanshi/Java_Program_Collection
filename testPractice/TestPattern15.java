package testPractice;

public class TestPattern15
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        int space=row;
        for (int i=1;i<=row;i++)
        {
            for (int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=column;j++)
            {
                if (j==1||j==column)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            column++;
            space--;
        }
        for (int i=1;i<=row;i++)
        {
            for (int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=column;j++)
            {
                if (j==1||j==column-1)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            column--;
            space++;
        }
    }
}
