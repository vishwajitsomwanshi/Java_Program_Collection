package Number;

public class Pattern50
{
    public static void main(String[] args)
    {
        int a=124;
        int sum=0;
        int temp=a;
        while(a!=0)
        {
            int x=a%10;
            sum=(sum*10)+x;
            a=a/10;
        }
        if (temp==sum)
        {
            System.out.println(sum +": This number is palindrome");
        }
        else
        {
            System.out.println(sum+": This number id not palindrome");
        }
    }
}
