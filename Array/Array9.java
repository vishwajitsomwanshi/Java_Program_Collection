package Array;
import java.util.Random;


public class Array9 {

    public static int[] array9 (int n)
    {
            Random rd=new Random();
            int [] ar=new int[n];
            for (int i=0;i<n;i++)
          ar[i]=rd.nextInt(50);
            return ar;
    }

    public static void main(String[] args)
    {
    }





























}
