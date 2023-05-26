package testPractice;

public class TestPattern9
{
    public static void main(String[] args)
    {
        int row=4;
        int column=1;
        int space=5;
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
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
            column+=2;
            space--;
        }
        for (int i=1;i<=row+1;i++)
        {
            for (int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=column;j++)
            {
                if (j==1||j==column-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
            column-=2;
            space++;
        }
    }
}
