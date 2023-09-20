import java.io.*;
 interface language 
 {
    void getName(String name);
}
class programminglanguage implements language{
 public void getName(String name)
    {
        System.out.println("my fav programminglanguage is"+name);
    }
}
 public class InterfaceDemo{
    public static void main(String args[]){
        programminglanguage pl=new programminglanguage();
        pl.getName("java");
    }
}
