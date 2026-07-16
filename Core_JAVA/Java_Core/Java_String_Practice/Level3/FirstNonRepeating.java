import java.util.Scanner;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstNonRepeating(s));
        sc.close();
    }
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++) if(freq[s.charAt(i)]==1) return s.charAt(i);
        return '\0';
    }
}
