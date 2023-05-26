package Number;

public class Pattern53
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int j= 2;j<=100; j++)
        {
            for (int i = 1; i <=j; i++)
            {
                if (j % i == 0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.println("total prime numbers:" +count);
            }
        }

    }

}
