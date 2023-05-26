package Number;

public class Pattern55
{
    public static void main(String[] args)
    {
        int a=153;
        int sum=0;
        int temp=a;
        int rev=0;
        while(a!=0)
        {
            rev=a%10;
            sum=sum+(rev*rev*rev);
            a=a/10;
        }
        if (sum==temp)
        {
            System.out.println(sum+": The number is armstrong number");
        }
    }
}
