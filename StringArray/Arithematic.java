package StringArray;

public class Arithematic {
    public static void main(String[] args) /*{
        int x=9,y=12,z=3;
        int exp1=x-y/3+z*2-1;
        int exp2=(x-y)/3+((z*2)-1);
        System.out.println(exp1);
        System.out.println(exp2);
    }*/ /*{
          double x=10.5;
          x/=4+2.5*2.5;
        System.out.println(x);
    }*/
    /*{
        int x,y,z;
                x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x+" "+y+" "+z);
    }*/
    {
        int x=1,y=2,z=5;
        System.out.println("x:"+(!((x=2)==(1+2))));
        System.out.println("y:"+(!(y==z)));
        System.out.println("z>x:"+(!(z>x)));
        if (!(x==y)&&((y+5)>z)&&(!((z-3)==0)))
        {
            System.out.println("hello");
        }

    }
}
