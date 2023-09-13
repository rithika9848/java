class sample{
    protected String job;
}
public class ProtectedDemo{
    public static void main(String args[]){
        sample s=new sample();
        s.job="studying";
        System.out.println("job is"+s.job);
    }
}
