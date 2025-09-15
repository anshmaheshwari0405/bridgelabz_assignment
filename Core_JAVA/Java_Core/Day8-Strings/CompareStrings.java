import java.util.*;
public class CompareStrings {
    public static int compare(String a,String b){
        int len=Math.min(a.length(),b.length());
        for(int i=0;i<len;i++){
            if(a.charAt(i)!=b.charAt(i)) return a.charAt(i)-b.charAt(i);
        }
        return a.length()-b.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int res=compare(a,b);
        if(res<0) System.out.println(a+" comes before "+b);
        else if(res>0) System.out.println(b+" comes before "+a);
        else System.out.println("Strings are equal");
        sc.close();
    }
}
