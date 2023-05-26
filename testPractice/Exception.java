package testPractice;

public class Exception
{
    public static void main(String[] args)
    {
        try{
            int a=10;
            int b=0;
            int res=a/b;
            System.out.println(res);

        }
        catch(ClassCastException t)
        {
            System.out.println("number is not divisible by 0");
        }
        catch(NullPointerException t)
        {
            System.out.println("number is not divisible by 0");
        }
        catch(RuntimeException t)
        {
            System.out.println("number is not divisible by 0");
        }

    }
}
