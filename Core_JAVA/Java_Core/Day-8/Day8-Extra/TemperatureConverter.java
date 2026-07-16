import java.util.*;
public class TemperatureConverter {
    public static double fToC(double f){ return (f-32)*5/9; }
    public static double cToF(double c){ return c*9/5+32; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double val=sc.nextDouble();
        String type=sc.next();
        if(type.equalsIgnoreCase("F")) System.out.println(fToC(val));
        else System.out.println(cToF(val));
        sc.close();
    }
}
