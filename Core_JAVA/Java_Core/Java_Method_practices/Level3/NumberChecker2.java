import java.util.*;
public class NumberChecker2 {
    public static int[] digits(int n){ int t=Math.abs(n); int c=(t==0)?1:(int)Math.floor(Math.log10(t))+1; int[] d=new int[c]; for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10; } return d; }
    public static int sumDigits(int n){ int s=0; for(int x:digits(n)) s+=x; return s; }
    public static int sumSquares(int n){ int s=0; for(int x:digits(n)) s+=x*x; return s; }
    public static boolean isHarshad(int n){ int s=sumDigits(n); return s!=0 && Math.abs(n)%s==0; }
    public static int[][] frequency(int n){
        int[] d=digits(n); int[] freq=new int[10]; for(int x:d) freq[x]++;
        int[][] out=new int[10][2]; for(int i=0;i<10;i++){ out[i][0]=i; out[i][1]=freq[i]; }
        return out;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum:"+sumDigits(n));
        System.out.println("SumSquares:"+sumSquares(n));
        System.out.println("Harshad? "+isHarshad(n));
        System.out.println("Frequency:");
        for(int[] row:frequency(n)) System.out.println(row[0]+":"+row[1]);
        sc.close();
    }
}
