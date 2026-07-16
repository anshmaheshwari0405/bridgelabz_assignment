import java.util.*;
public class AnagramCheck {
    public static boolean isAnagram(String a,String b){
        char[] ca=a.replaceAll("\s+","").toLowerCase().toCharArray();
        char[] cb=b.replaceAll("\s+","").toLowerCase().toCharArray();
        Arrays.sort(ca); Arrays.sort(cb);
        return Arrays.equals(ca,cb);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(isAnagram(a,b));
        sc.close();
    }
}
