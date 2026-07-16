import java.util.*;
public class QuadraticRoots {
    public static double[] roots(double a,double b,double c){
        double delta=b*b-4*a*c;
        if(delta<0)return new double[]{};
        if(delta==0)return new double[]{-b/(2*a)};
        double r1=(-b+Math.sqrt(delta))/(2*a);
        double r2=(-b-Math.sqrt(delta))/(2*a);
        return new double[]{r1,r2};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double[] r=roots(a,b,c);
        if(r.length==0)System.out.println("No real roots");
        else{
            for(double x:r)System.out.println(x);
        }
        sc.close();
    }
}
