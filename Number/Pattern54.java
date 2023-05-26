package Number;

public class Pattern54
{
    public static void main(String[] args)
    {
        for (int i=1;i<1000;i++)
        {
            int a=i;
            int count=0;
            int sum=0;
            for (int j=1;j<a;j++)
            {
                if (a%j==0)
                sum+=j;
            }
            if(sum==a)
            {
                System.out.println("perfect number :"+sum);
            }
        }
    }
}
