package testPractice;

public class StringReverse
{
    public static void main(String[] args)
    {
        String str="tijawhsiv";
        String revstr="";
        for (int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println(revstr);
    }
}
