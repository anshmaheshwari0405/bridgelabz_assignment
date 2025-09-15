import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){ if(s.charAt(i)!=s.charAt(j)) return false; i++; j--; }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isPalindrome(s));
        sc.close();
    }
}
