 class A {
    void m (){
        System.out.println("inside method m");
    }
  void n(){
      System.out.println("inside method n");
      this.m();
  }
}
 public class ThismethodDemo{
    public static void main (String args[]){
        A a=new A();
    }
}
