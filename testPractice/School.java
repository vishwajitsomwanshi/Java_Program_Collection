package testPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class School
{
    Student s;
    ArrayList<Student> a1=new ArrayList<Student>();
    public void addStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  id of Student");
        int sid=sc.nextInt();
        System.out.println("enter the name of Student");
        String sName=sc.next();
        System.out.println("enter the standard of student");
        int std=sc.nextInt();
        System.out.println("enter the city of student");
        String city=sc.next();
         s=new Student(sid,sName,std,city);
         a1.add(s);
        System.out.println("student added successfully");
    }
    public void removeStudent()
    {
        if (this.s==null)
        {
            System.out.println("no Student added..");
        }
        else
        {

        }
    }
}
