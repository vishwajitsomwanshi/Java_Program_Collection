package patternProgramming;

public class Pattern15
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        char k='A';
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(k++);

                if(k=='F')
                {
                    System.out.print('A');
                }
            }
            System.out.println();
            column++;
        }
    }
}
