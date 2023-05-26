package testPractice;

public class KuchKuchHotaHota
{
    public static void main(String[] args)
    {
        System.out.println("movie Start");
        anjali();
        System.out.println("movie end");
    }
    public static void anjali()
    {
        boolean b1=rahul();
        System.out.println(b1);
        System.out.println("anjali loves rahul");;
    }
    public static boolean rahul()
    {
        tina();
      boolean flag=true;
        System.out.println("rahul loves tina");
        return flag;
    }
    public static void tina()
    {
        System.out.println("dead");
    }
}
