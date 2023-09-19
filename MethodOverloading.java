import java.io.*;
class adder{
    int add(int a,int b)
    {
        return a+b;
    }
int add (int a,int b,int c)
    {
        return a+b+c;
    }
}
 public class MethodeDemo1{
    public static void main(String args[]){
        adder ad = new adder();
        int x = ad.add(5,10);
        int y = ad.add(10,20,30);
        int z = ad.add(x,y);
        System.out.println("x value is"+x);
        System.out.println("y value is"+y);
        System.out.println("z value is"+z);
    }
}
