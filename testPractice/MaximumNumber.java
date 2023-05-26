package testPractice;

public class MaximumNumber
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        int max=ar[0];
        for (int a:ar)
        {
            if (a>max)
            {
                max=a;
            }
        }
        System.out.println(max);
    }
}
