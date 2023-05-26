package Array;

public class InsertionSorting
{
    public static void main(String[] args)
    {
        int ar[]={9,10,1,2,3,7,8,6};
        for (int i=1;i<ar.length;i++)
        {
            int key=ar[i];
            int  j=i-1;
            while(j>=0&&ar[j]>key)
            {
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        for (int a:ar)
        {
            System.out.println(a);

        }
    }
}
