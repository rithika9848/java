import java.io.*;
 class student{
    int RollNumber;
    String name;
    float fee;
    student(int RollNumber, String name, float fee)
    {
        this.RollNumber=RollNumber;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println("student details are");
        System.out.println(RollNumber+"  "+name+"  "+fee);
    }
}
 public class ThisDemo2{
    public static void main(String args[]){
        student s1= new student(4201,"b.rithika",45700);
        student s2= new student(4242,"n.rajesware",45700);
        s1.display();
        s2.display();
    }
}  



