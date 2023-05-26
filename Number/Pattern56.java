package Number;

public class Pattern56
{
    public static void main(String[] args)
    {
        int count = 0;
        int rev = 0;
        int sum = 0;
       for (int i=10;i<100000;i++)
       {
           int a = i;
           int temp = a;
           while (temp != 0) {
               temp = temp % 10;
               count++;
           }
           while (a != 0) {
               rev = a % 10;
               sum = (int) (sum + Math.pow(rev, count));
               a = a / 10;
           }

           if (sum == temp) {
               System.out.println(i + ": This number is armstrong number");
           }
       }
    }
}
