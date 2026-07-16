import java.util.Scanner;
public class TrimSubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String t = trim(s);
        String sub = substring(s,start,end);
        System.out.println(t.equals(s.trim()));
        System.out.println(sub.equals(s.substring(start,end)));
        sc.close();
    }
    static String trim(String s) {
        int st=0,en=s.length()-1;
        while(st<=en && s.charAt(st)==' ') st++;
        while(en>=st && s.charAt(en)==' ') en--;
        StringBuilder sb = new StringBuilder();
        for(int i=st;i<=en;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
    static String substring(String s,int a,int b) {
        StringBuilder sb = new StringBuilder();
        for(int i=a;i<b;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}
