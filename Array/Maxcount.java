package Array;

public class Maxcount
{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,6,6,1,2,3,};
        int maxcount=0;
        int value=0;
        for (int a:arr)
        {
            int count=0;
            for (int b:arr)
            {
                if(a==b)
                    count++;
            }
            if (count>maxcount)
            {
                maxcount=count;
                value=a;
            }
        }
        System.out.println(value);
    }
}
