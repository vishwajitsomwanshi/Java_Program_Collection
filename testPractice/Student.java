package testPractice;
import java.util.Objects;
public class Student
{
    int sid;
    String sName;
    int std;
    String city;
    Student(int sid,String sName,int std,String city)
    {
        this.sid=sid;
        this.sName=sName;
        this.std=std;
        this.city=city;
    }
    public String toString()
    {
        return "student id"+sid+"student name"+sName+" student standard"+std+"student city"+city;
    }

    @Override
    public boolean equals(Object o)
    {
        return this.sid==sid&&this.sName.equals(sName)&&this.std==std&&this.city.equals(city);
    }
    public int hashCode()
    {
        return Objects.hash(sid,sName,std,city);
    }

}
