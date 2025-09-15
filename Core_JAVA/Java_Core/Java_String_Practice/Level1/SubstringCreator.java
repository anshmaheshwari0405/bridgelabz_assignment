import java.util.Scanner;
public class SubstringCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(substring(s,start,end));
        sc.close();
    }
    static String substring(String s,int st,int en) {
        if(st<0) st=0;
        if(en> s.length()) en = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=st;i<en;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}
