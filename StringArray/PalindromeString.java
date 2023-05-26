package StringArray;

public class PalindromeString
{
    public static void main(String[] args)
    {
        String str="NITIN";
        String revstr="";
        for (int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);

        }
        if (str.equals(revstr))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}
