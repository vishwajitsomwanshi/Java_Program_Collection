package patternProgramming;

public class Pattern14
{
    public static void main(String[] args)
    {
      int row=6;
      int column=2;
      int k=1;
      int k2=0;
      for (int i=0;i<=row;i++)
      {
          for (int j=0;j<column;j++)
          {
              if(i%2==0)
              {
                  System.out.print(k-k2);
                  k2++;
              }
              else
              {
                  System.out.print("*");
              }
          }
          System.out.println();
          column++;
      }

    }
}
