package Array;
import java.util.Random;
public class RandomArray
{
    public static void main(String[] args)
    {
        Random rand=new Random();
        int arr[]=new int[10];
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=rand.nextInt(10);
        }
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
}
