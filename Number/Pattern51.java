package Number;

public class Pattern51
{
    public static void main(String[] args)
    {
        int count=0;
        for (int i=1;i<10000;i++)
        {
            int a=i;
            int sum=0;
            int temp=a;
            while(a!=0)
            {
                int r=a%10;
                sum=(sum*10)+r;
                a=a/10;
            }
            if (sum==temp)
            {
                count++;
            }
        }
        System.out.println(" total palindrome number :" + count);
    }
}
