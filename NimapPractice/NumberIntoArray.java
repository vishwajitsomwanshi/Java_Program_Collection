package NimapPractice;

import java.util.Scanner;

public class NumberIntoArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++)
        {
            int no=sc.nextInt();
            arr[i]=no;
        }
        System.out.print(arr);
        for(int j:arr)
        {
            System.out.print(j);
        }

    }
}
