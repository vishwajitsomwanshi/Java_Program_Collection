package AngularMinds;


public class Program6
{
    public static void main(String[] args)
    {
        System.out.println("vishwa");
        System.out.println("=================");
        main(5);
        main('v');

    }

    public static void main(int a)
    {
        System.out.println("this is external method");
        System.out.println(a);
        System.out.println("=========================");
    }

    public static void main(char b)
    {
        System.out.println("this is second external method");
        System.out.println(b);

    }


}
