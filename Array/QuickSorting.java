package Array;

public class QuickSorting
{
    public static void main(String[] args)
    {
        int [] arr={10,1,2,3,11,13,5};
        sort(arr,0,arr.length-1);
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
    public static void sort(int[] arr,int low,int high)
    {
        if (low<high)
        {
            int idx=partition(arr,low,high);
            sort(arr,0,idx-1);
            sort(arr,idx+1,high);

        }
    }
    public static int partition(int []arr, int low, int high)
    {
       int pi=arr[high];
       int i=low-1;
       for (int j=low;j<high;j++)
       {
           if (arr[j]<pi)
           {
               i++;
               swap(i,j,arr);

           }
       }
       swap(i+1,high,arr);
        return i+1;
    }
    public static void swap(int a,int b,int []arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
