import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(isAnagram(a,b));
        sc.close();
    }
    static boolean isAnagram(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        int[] f = new int[256];
        for(int i=0;i<s1.length();i++) f[s1.charAt(i)]++;
        for(int i=0;i<s2.length();i++) f[s2.charAt(i)]--;
        for(int i=0;i<256;i++) if(f[i]!=0) return false;
        return true;
    }
}
