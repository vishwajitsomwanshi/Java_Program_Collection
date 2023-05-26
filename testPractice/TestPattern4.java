package testPractice;

public class TestPattern4
{
    public static void main(String[] args)
    {
        int row=4;
        int column=1;
        int space=row-1;
        int x=1;
        int y=1;
        int square=1;
        for (int i=1;i<=row;i++)
        {
            for (int k=0;k<space;k++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=column;j++)
            {
                square=x*y;
                System.out.print(square+"  ");
                x++;
                y++;
            }
            System.out.println();
            column++;
            space--;
        }
    }
}
