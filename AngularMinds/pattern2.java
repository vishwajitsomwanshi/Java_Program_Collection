package AngularMinds;

public class pattern2
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

                if (a>5)
                {
                   a=1;
                }
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
