import java.util.*;
public class BasicCalculator {
    public static double add(double a,double b){ return a+b; }
    public static double sub(double a,double b){ return a-b; }
    public static double mul(double a,double b){ return a*b; }
    public static double div(double a,double b){ return a/b; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble();
        String op=sc.next();
        switch(op){
            case "+": System.out.println(add(a,b)); break;
            case "-": System.out.println(sub(a,b)); break;
            case "*": System.out.println(mul(a,b)); break;
            case "/": System.out.println(div(a,b)); break;
            default: System.out.println("Invalid"); break;
        }
        sc.close();
    }
}
