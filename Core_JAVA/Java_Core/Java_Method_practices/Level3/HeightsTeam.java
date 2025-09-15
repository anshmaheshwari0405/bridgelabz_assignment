import java.util.*;
public class HeightsTeam {
    public static int[] generateHeights(int n){
        int[] h = new int[n];
        for(int i=0;i<n;i++) h[i] = (int)(Math.random()*101) + 150;
        return h;
    }
    public static int sum(int[] a){ int s=0; for(int x:a) s+=x; return s; }
    public static double mean(int[] a){ return sum(a)/(double)a.length; }
    public static int min(int[] a){ int m=a[0]; for(int x:a) if(x<m) m=x; return m; }
    public static int max(int[] a){ int M=a[0]; for(int x:a) if(x>M) M=x; return M; }
    public static void main(String[] args){
        int[] heights = generateHeights(11);
        System.out.println(Arrays.toString(heights));
        System.out.println("Sum:"+sum(heights));
        System.out.println("Mean:"+mean(heights));
        System.out.println("Shortest:"+min(heights));
        System.out.println("Tallest:"+max(heights));
    }
}
