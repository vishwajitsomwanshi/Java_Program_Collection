package testPractice;

public class ArrowPattern
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                if (j-i==2||j-i==3||i+j==6||i-j==3||i-j==2)
                {
                    System.out.print("  *");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
