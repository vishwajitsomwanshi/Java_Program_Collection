package Array;

public class UnknownNumber
{
    public static void main(String[] args)
    {
        int []arr={1,2,3,5,6,7,8};
        int n=arr.length;
        int expsum=((n+1)*(n+2))/2;
        for (int a:arr)
        {
            expsum=expsum-a;
        }
        System.out.println(expsum);
    }
}
