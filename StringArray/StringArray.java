package StringArray;

public class StringArray
{
    public static void main(String[] args)
    {
        String str="PROGRAMMING";
        String revstr="";
       // System.out.println(str.charAt(4));
        for (int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
       for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        for (int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println("Reverse String :"+revstr);

    }
}
