package Array;

public class Array7
{
    public static void main(String[] args)
    {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        int min=ar[0];
        for (int a:ar)
        {
            if(a<min)
                min=a;

        }
        System.out.println(min);
    }
}
