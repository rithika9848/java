import java.io.*;
class student{
    int RollNumber;
    String name;
    float fee;
    student(int RollNumber, String name, float fee)
    {
        RollNumber= RollNumber;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println("student details are");
        System.out.println(RollNumber+"  "+name+"  "+fee);
    }
}
public class ThisDemo1{
    public static void main(String args[]){
        student s1=new student(4201,"b.rithika",45700);
        student s2=new student(4242,"n,rajeswari",45700);
        s1.display();
        s2.display();
    }
}


