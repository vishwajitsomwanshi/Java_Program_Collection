package Array;

public class BubblesortingArray
{

    public static void main(String[] args)
    {
        int []arr={1,2,5,4,6,8,9};
        int n=arr.length-1;
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<n-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
}
