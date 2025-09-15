import java.util.Scanner;
public class ToLowerCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String lo = toLower(s);
        System.out.println(lo.equals(s.toLowerCase()));
        sc.close();
    }
    static String toLower(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c>='A' && c<='Z') sb.append((char)(c+32));
            else sb.append(c);
        }
        return sb.toString();
    }
}
