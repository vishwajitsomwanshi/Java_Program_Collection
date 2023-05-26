package Array;

public class ConcatArray
{
    public static void main(String[] args)
    {
        int []arr1={1,2,3,4,5};
        int []arr2={6,7,8,9};
        int size1=arr1.length;
        int size2=arr2.length;
        int[]arr3=new int [size1+size2];
        int idx=0;
        for (int a:arr1)
        {
            arr3[idx]=a;
            idx++;
        }
        for (int a:arr2)
        {
            arr3[idx]=a;
            idx++;
        }
        for (int a:arr3)
        {
            System.out.print(a+" ");
        }
    }
}
