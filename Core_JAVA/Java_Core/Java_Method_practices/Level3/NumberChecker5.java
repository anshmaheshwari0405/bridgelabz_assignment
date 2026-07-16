import java.util.*;
public class NumberChecker5 {
    public static int sumProperDivisors(int n){
        if(n<=1) return 0;
        int s=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                s+=i;
                int j=n/i;
                if(j!=i) s+=j;
            }
        }
        return s;
    }
    public static boolean isPerfect(int n){ return n>1 && sumProperDivisors(n)==n; }
    public static boolean isAbundant(int n){ return sumProperDivisors(n)>n; }
    public static boolean isDeficient(int n){ return sumProperDivisors(n)<n; }
    public static int factorial(int n){ if(n<=1) return 1; int f=1; for(int i=2;i<=n;i++) f*=i; return f; }
    public static boolean isStrong(int n){
        int t=Math.abs(n); int s=0;
        while(t>0){ s+=factorial(t%10); t/=10; }
        return s==Math.abs(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Perfect? "+isPerfect(n));
        System.out.println("Abundant? "+isAbundant(n));
        System.out.println("Deficient? "+isDeficient(n));
        System.out.println("Strong? "+isStrong(n));
        sc.close();
    }
}
