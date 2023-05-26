package patternProgramming;

import java.util.Scanner;
class calculator
{
    Scanner sc=new Scanner(System.in);
    public void addition()
    {
        System.out.println("enter the first number for addition");
        int num1=sc.nextInt();
        System.out.println("enter the second number for addition");
        int num2=sc.nextInt();
        int result=num1+num2;
        System.out.println("addition of "+num1+" and "+num2+" :"+result);
    }
    public void substraction()
    {
        System.out.println("enter the first number for substraction");
        int num1=sc.nextInt();
        System.out.println("enter the second number for substraction");
        int num2=sc.nextInt();
        int result=num1-num2;
        System.out.println("substraction of "+num1+" and "+num2+" :"+result);
    }
    public void multiplication()
    {
        System.out.println("enter the first number for multiplication");
        int num1=sc.nextInt();
        System.out.println("enter the second number for multiplication");
        int num2=sc.nextInt();
        int result=num1*num2;
        System.out.println("multiplication of "+num1+" and "+num2+" :"+result);
    }
    public void division()
    {
        System.out.println("enter the first number for division");
        int num1=sc.nextInt();
        System.out.println("enter the second number for division");
        int num2=sc.nextInt();
        int result=num1/num2;
        System.out.println("division of "+num1+" and "+num2+" :"+result);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        calculator c1=new calculator();
        //c1.addition();
        // c1.substraction();
        //c1.multiplication();
        //c1.division();
        System.out.println("enter the choice \n1.addition\n2.substraction\n3.multiplication\n4.division\n5.exit\n6.default");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1 :
            {
                c1.addition();
            }
            break;
            case 2 :
            {
                c1.substraction();
            }
            break;
            case 3 :
            {
                c1.multiplication();
            }
            break;
            case 4 :
            {
                c1.division();
            }
            break;
            // case 5:
            // {
            //exit=false;
            //}
            // break;
            default:
            {
                System.out.println("invalid choice");
            }

        }
    }
}
