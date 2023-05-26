package patternProgramming;

public class Pattern20
{
    public static void main(String[] args)
    {
      int row=5;
      int column=5;
      int k=5;
      for (int i=1;i<=row;i++)
      {
          for (int j=1;j<=column;j++)
          {
             System.out.print(k);

          }
          System.out.println();
          column--;
          k--;
      }
    }
}
