package NimapPractice;

import java.util.Scanner;

public class AdditionOfMultipleNum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Count");
        int count=sc.nextInt();
        int number,sum=0;
        for (int i = 0; i < count; i++) {
            number=sc.nextInt();
            sum=sum+number;
        }
        System.out.println("Addition of These Number :"+sum);
    }
}
