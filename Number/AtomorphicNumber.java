package Number;

public class AtomorphicNumber
{
    public static void main(String[] args)
    {
        int a=100;
        int r=0;
        int count=0;
        for(int i=0;i<a;i++)
        {
            r = a % 100;
            int sq = a * a;
            a=a/100;

        }

            if (a == r)
            {
                count++;
            }
        System.out.println(count);
    }
}
