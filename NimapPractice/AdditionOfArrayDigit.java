package NimapPractice;

public class AdditionOfArrayDigit
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for (int i:arr) {
            sum=sum+i;
        }
        float avg=(float) sum/3;
        System.out.println("Addition of Array :"+sum);
        System.out.println("Average of Array :"+avg);
    }
}
