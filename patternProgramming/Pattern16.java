package patternProgramming;

public class Pattern16
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
            column++;
        }
    }
}
