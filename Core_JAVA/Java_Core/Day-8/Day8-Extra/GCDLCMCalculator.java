import java.util.*;
public class GCDLCMCalculator {
    public static int gcd(int a,int b){ while(b!=0){ int t=b; b=a%b; a=t; } return a; }
    public static int lcm(int a,int b){ return a/gcd(a,b)*b; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println("GCD:"+gcd(a,b)+" LCM:"+lcm(a,b));
        sc.close();
    }
}
