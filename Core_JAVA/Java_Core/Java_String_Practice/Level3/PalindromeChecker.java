import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindromeIter(s));
        System.out.println(isPalindromeRec(s,0,s.length()-1));
        System.out.println(isPalindromeByReverse(s));
        sc.close();
    }
    static boolean isPalindromeIter(String s) {
        int i=0,j=s.length()-1;
        while(i<j) { if(s.charAt(i)!=s.charAt(j)) return false; i++; j--; }
        return true;
    }
    static boolean isPalindromeRec(String s,int i,int j) {
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindromeRec(s,i+1,j-1);
    }
    static boolean isPalindromeByReverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) sb.append(s.charAt(i));
        return sb.toString().equals(s);
    }
}
