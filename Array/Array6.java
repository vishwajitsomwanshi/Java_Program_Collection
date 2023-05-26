package Array;

public class Array6
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        for (int a:ar)
        {
            int sum=0;
            for (int i=1;i<a;i++)
                if(a%i==0)
                sum+=i;
            if(sum==a)
                System.out.println(a);
        }
    }
}
