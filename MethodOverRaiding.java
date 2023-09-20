import java.io.*;
class Bank{
    int getRateOfIntrest()
    {
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfIntrest()
    {
        return 8;
    }
}
class HDFC extends Bank{
    int getRateOfIntrest()
    {
        return 9;
    }
}
class Unionbank extends Bank{
    int getRateOfIntrest()
    {
     return 10;   
    }
}
 public class MethodOverRaidingDemo{
    public static void main(String args[]){
        SBI s = new SBI();
        HDFC h = new HDFC();
        Unionbank u = new Unionbank();
        System.out.println("SBI RateofInterst is"+s.getRateOfIntrest());
        System.out.println("HDFC Bank RateofInsterst is"+h.getRateOfIntrest());
        System.out.println("union bank RateofInterst is"+u.getRateOfIntrest());
    }
}
