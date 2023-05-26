package testPractice;

public class TestPattern6
{
    public static void main(String[] args)
    {
        int row=5;
        int column=1;
        for (int i=0;i<row;i++)
        {
            char k= (char) ('A'+i);
            for (int j=0;j<column;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
            column++;
        }
    }
}
