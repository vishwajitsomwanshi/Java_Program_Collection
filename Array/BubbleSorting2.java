package Array;
import java.util.Random;
public class BubbleSorting2
{
    public static void main(String[] args)
    {
       Random vkrand=new Random();
       int ar[]=new int[10];
       for (int i=0;i<10;i++)
       {
           ar[i]=vkrand.nextInt(50);
       }
       for (int a:ar)
       {
           System.out.println(a);
       }
    }
}
