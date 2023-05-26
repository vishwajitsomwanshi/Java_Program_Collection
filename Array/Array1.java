package Array;

public class Array1
{
    public static void main(String[] args)
    {
        try
        {
            int[] ar = {2, 4, 6, 8, 10};
            for (int i = 4; i < ar.length; i--)
            {
                System.out.println(ar[i]+" ");
            }
        }
        catch (ArrayIndexOutOfBoundsException T)
        {
            System.out.println("it is not out of of bound");
        }

    }
}
