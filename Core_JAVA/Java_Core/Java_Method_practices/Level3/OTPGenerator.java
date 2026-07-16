import java.util.*;
public class OTPGenerator {
    public static int generate6Digit(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean unique(int[] arr){
        Set<Integer> s=new HashSet<>();
        for(int x:arr){ if(s.contains(x)) return false; s.add(x); }
        return true;
    }
    public static void main(String[] args){
        int[] otps=new int[10];
        for(int i=0;i<10;i++) otps[i]=generate6Digit();
        System.out.println(Arrays.toString(otps));
        System.out.println("All unique? "+unique(otps));
    }
}
