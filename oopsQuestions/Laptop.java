package oopsQuestions;

public class Laptop
{
     static Hdd h2=new Hdd();
    void getInfo(){
        System.out.println("Laptop Name =Lenovo");
    }
}
class Hdd {
    void getType(){
        System.out.println("hdd is ssd");
    }
}
class main{
    public static void main(String[] args) {
       Laptop l1=new Laptop();
        l1.getInfo();
        Laptop.h2.getType();
    }
}
