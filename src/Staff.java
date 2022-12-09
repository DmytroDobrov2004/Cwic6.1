import java.util.Scanner;

public class Staff  extends  Person implements  Salary{
    private  String DDPosition;
    private  String DDEducation;

    @Override
    public double salaryToPay(double DDhours, double DDrate)
    {
        return DDhours * DDrate;
    }
    @Override
    public double salaryForOverTime(double DDhours, double DDrate)
    {
        return DDhours * DDrate * 3.0;
    }


    public void inicjuj1(){
        Scanner in = new Scanner(System.in);
        super.inicjuj();
        System.out.println("");
        this.DDPosition = in.next();
        System.out.println();
        this.DDEducation = in.next();
    }
    public void  print1()
    {
        System.out.println("Twoja edukacja "+ DDEducation);
        System.out.println("Twoja pozycja "+ DDPosition);

    }
}