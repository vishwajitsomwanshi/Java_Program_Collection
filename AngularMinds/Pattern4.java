package AngularMinds;

public class Pattern4
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        for (int i=1;i<=row;i++)
        {
            int a=1;
            for (int j=1;j<=column;j++)
            {
                if ((i==1||i==row||j==1||j==column))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
