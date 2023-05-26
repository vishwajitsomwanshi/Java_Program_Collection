package Array;

public class Array10
{
    public static void main(String[] args)
    {
        int ar[]={4,5,8,9,12,56};
      int max1=ar[0];
       int max2=ar[1];
       for (int a:ar)
       {
           if(a>max1)
           {
               max2=max1;
               max1=a;
           }
           else if(a>max2)
           {
               max2=a;
           }
           else
           {

           }
       }
        System.out.println(max1);
        System.out.println(max2);
    }
}
