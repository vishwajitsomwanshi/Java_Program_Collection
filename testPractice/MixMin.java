package testPractice;

public class MixMin
{
    public static void main(String[] args)
    {
        int []arr={12,56,89,67,58};
        int max1=arr[0];
        int max2=arr[1];
        for (int a:arr)
        {
            if(a>max1)
            {
                max2=max1;
                max1=a;
            }
            else if (a>max2)
            {
                max2=a;
            }
            else
            {

            }
        }
        System.out.println(max1);
        System.out.println(max2);

    }
}
