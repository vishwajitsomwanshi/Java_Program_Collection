package NimapPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionOfNNumbers
{
    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Enter the n values :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        int sum=(n*(n+1))/2;
        System.out.println(sum);
    }
}
