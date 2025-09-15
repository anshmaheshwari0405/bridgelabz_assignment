import java.util.*;
public class NumberChecker3 {
    public static int[] digits(int n){ int t=Math.abs(n); if(t==0) return new int[]{0}; int c=0, tmp=t; while(tmp>0){ c++; tmp/=10;} int[] d=new int[c]; for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10; } return d; }
    public static int[] reverseArray(int[] a){ int[] r=new int[a.length]; for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i]; return r; }
    public static boolean arraysEqual(int[] a,int[] b){ if(a.length!=b.length) return false; for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false; return true; }
    public static boolean isPalindrome(int n){ return arraysEqual(digits(n), reverseArray(digits(n))); }
    public static boolean isDuck(int n){ for(int x:digits(n)) if(x==0) return true; return false; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Reversed digits:"+Arrays.toString(reverseArray(digits(n))));
        System.out.println("Array equal to reversed? "+arraysEqual(digits(n), reverseArray(digits(n))));
        System.out.println("Palindrome? "+isPalindrome(n));
        System.out.println("Duck? "+isDuck(n));
        sc.close();
    }
}
