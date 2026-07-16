import java.util.*;
public class NumberChecker4 {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq=n*n; int s=0; while(sq>0){ s+=sq%10; sq/=10; } return s==n;
    }
    public static boolean isSpy(int n){
        int s=0,p=1; int t=Math.abs(n); if(t==0) p=0;
        while(t>0){ int d=t%10; s+=d; p*=d; t/=10; }
        return s==p;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n; String s=String.valueOf(n); return String.valueOf(sq).endsWith(s);
    }
    public static boolean isBuzz(int n){ return n%7==0 || n%10==7; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime? "+isPrime(n));
        System.out.println("Neon? "+isNeon(n));
        System.out.println("Spy? "+isSpy(n));
        System.out.println("Automorphic? "+isAutomorphic(n));
        System.out.println("Buzz? "+isBuzz(n));
        sc.close();
    }
}
