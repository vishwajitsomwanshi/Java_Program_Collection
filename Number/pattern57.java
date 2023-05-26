package Number;

public class pattern57
{
    public static void main(String[] args)
    {
        int a=9;
        int sq=a*a;
        int sum=0;
        while(sq!=0)
        {
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if(sum==a)
        {
            System.out.println("number is neon number");
        }
    }
}
