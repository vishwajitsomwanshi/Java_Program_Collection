package patternProgramming;

public class pattern4
{
    public static void main(String[] args)
    {
        int row=5;
        int column=5;

        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=column;j++)
            {
                if (j==1||j==5||i==1||i==j||(j+i)==6||i==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }

            }
            System.out.println();
        }
    }
}
