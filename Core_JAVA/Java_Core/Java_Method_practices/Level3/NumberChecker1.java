import java.util.*;
public class NumberChecker1 {
    public static int countDigits(int n){ int c=0; int t=Math.abs(n); if(t==0) return 1; while(t>0){ c++; t/=10; } return c; }
    public static int[] digitsArray(int n){
        int t=Math.abs(n);
        int c=countDigits(t);
        int[] d=new int[c];
        for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10; }
        return d;
    }
    public static boolean isDuck(int n){
        int[] d=digitsArray(n);
        for(int x:d) if(x==0) return true;
        return false;
    }
    public static boolean isArmstrong(int n){
        int[] d=digitsArray(n); int p=d.length; int sum=0;
        for(int x:d) sum += Math.pow(x,p);
        return sum==Math.abs(n);
    }
    public static int[] largestTwo(int n){
        int[] d=digitsArray(n);
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int x:d){ if(x>first){ second=first; first=x; } else if(x>second) second=x; }
        return new int[]{first,second};
    }
    public static int[] smallestTwo(int n){
        int[] d=digitsArray(n);
        int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for(int x:d){ if(x<first){ second=first; first=x; } else if(x<second) second=x; }
        return new int[]{first,second};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Digits:"+countDigits(n));
        System.out.println("Digits array:"+Arrays.toString(digitsArray(n)));
        System.out.println("Duck? "+isDuck(n));
        System.out.println("Armstrong? "+isArmstrong(n));
        System.out.println("Largest two:"+Arrays.toString(largestTwo(n)));
        System.out.println("Smallest two:"+Arrays.toString(smallestTwo(n)));
        sc.close();
    }
}
