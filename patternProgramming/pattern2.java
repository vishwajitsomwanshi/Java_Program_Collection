package patternProgramming;

public class pattern2
{
    public static void main(String[] args)
    {
       int row=3;
       int column=6;

       for (int i=1;i<=row;i++)
       {
           char k='A';
           for (int j=1;j<=column;j++)
           {
               System.out.print(k++ +" ");
           }
           System.out.println();
       }
    }
}
