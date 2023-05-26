package StringArray;

public class StringPalindorme2
{
    public static void main(String[] args)
    {
        String str="nitin";
        String revstr="";
        for (int i=str.length()-1;i>=0;i--)
        {
             revstr+=str.charAt(i);
            if (str.equals(revstr))
            {
                System.out.println("string is palindrome");
            }
        }
    }
}
