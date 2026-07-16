import java.util.*;
public class FactorsAdvanced {
    public static int[] factors(int n){
        int cnt=0;
        for(int i=1;i<=n;i++) if(n%i==0) cnt++;
        int[] f=new int[cnt]; int idx=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[idx++]=i;
        return f;
    }
    public static int greatestFactor(int[] f){ return f[f.length-1]; }
    public static int sum(int[] f){ int s=0; for(int x:f) s+=x; return s; }
    public static long product(int[] f){ long p=1; for(int x:f) p*=x; return p; }
    public static long productOfCubes(int[] f){ long p=1; for(int x:f) p*= (long)Math.pow(x,3); return p; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println(Arrays.toString(f));
        System.out.println("Greatest:"+greatestFactor(f));
        System.out.println("Sum:"+sum(f));
        System.out.println("Product:"+product(f));
        System.out.println("ProductCubes:"+productOfCubes(f));
        sc.close();
    }
}
