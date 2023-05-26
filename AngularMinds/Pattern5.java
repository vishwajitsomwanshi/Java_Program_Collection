package AngularMinds;

public class Pattern5
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                if (i==j||i+j==6||i+j==4||i+j==8)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            column++;
            System.out.println();
        }
    }
}
