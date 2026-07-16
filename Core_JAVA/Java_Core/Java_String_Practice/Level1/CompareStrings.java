import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(compare(a,b));
        sc.close();
    }
    static boolean compare(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
}
