package testPractice;

public class TestPattern1
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        int space=1;
        for (int i=1;i<=row;i++)
        {
            for (int k=0;k<=space;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=column;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            column--;
            space++;
        }
    }
}
