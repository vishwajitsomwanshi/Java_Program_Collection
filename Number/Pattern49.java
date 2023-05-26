package Number;

public class Pattern49
{
    public static void main(String[] args)
    {
        int a=1234;
        int sum=0;
        while(a!=0)
        {
            int x=a%10;
            sum=(sum*10)+x;
            a=a/10;
        }
        System.out.println("Reverse number is :"+sum);
    }
}
