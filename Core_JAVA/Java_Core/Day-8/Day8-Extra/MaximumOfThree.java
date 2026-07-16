import java.util.*;
public class MaximumOfThree {
    public static int maxOfThree(int a,int b,int c){ return Math.max(a,Math.max(b,c)); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        System.out.println(maxOfThree(a,b,c));
        sc.close();
    }
}
