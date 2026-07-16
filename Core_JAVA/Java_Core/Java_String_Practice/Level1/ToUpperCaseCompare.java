import java.util.Scanner;
public class ToUpperCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String up = toUpper(s);
        System.out.println(up.equals(s.toUpperCase()));
        sc.close();
    }
    static String toUpper(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c>='a' && c<='z') sb.append((char)(c-32));
            else sb.append(c);
        }
        return sb.toString();
    }
}
