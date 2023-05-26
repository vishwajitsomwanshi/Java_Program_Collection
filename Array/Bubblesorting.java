package Array;
import java.util.Random;
public class Bubblesorting
{

    public static void main(String[] args)
    {
        Random rand=new Random();
        int ar[]=new int[10];
        int n=ar.length-1;
        for (int i=0;i<n;i++)
        {

            for (int j=1;j<n-i;j++)
            {
                ar[i]=rand.nextInt(20);
                if (ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }

        }
        for (int a:ar)
        {
            System.out.print(a+" ");
        }

    }

}
