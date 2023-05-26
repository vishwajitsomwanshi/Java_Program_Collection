package patternProgramming;

public class Pattern21
{
    public static void main(String[] args)
    {
         int row=5;
         int column=5;
            for (int i=0;i<row;i++)
             {
                  for (int j=0;j<column;j++)
                  {
                      if (j%2==0)
                      {
                          System.out.print((row*(j))+i+1+" ");
                      }
                      else
                      {
                          System.out.print(((row * (j + 1)) - i) + " ");
                      }
                  }
                 System.out.println();
             }
    }
}
