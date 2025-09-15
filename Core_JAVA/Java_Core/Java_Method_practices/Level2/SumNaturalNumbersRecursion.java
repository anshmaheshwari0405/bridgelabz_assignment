import java.util.*;
public class SumNaturalNumbersRecursion {
    public static int recursiveSum(int n){ if(n<=1)return n; return n+recursiveSum(n-1); }
    public static int formulaSum(int n){ return n*(n+1)/2; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){ System.out.println("Not a natural number"); return;}
        int r=recursiveSum(n);
        int f=formulaSum(n);
        System.out.println("Recursive:"+r+" Formula:"+f);
        System.out.println(r==f);
        sc.close();
    }
}
