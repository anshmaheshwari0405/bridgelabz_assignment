import java.util.Scanner;
public class SplitWordsLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = splitWords(line);
        for(String w: words) System.out.println(w + " " + w.length());
        sc.close();
    }
    static String[] splitWords(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++) if(s.charAt(i)==' ') count++;
        String[] res = new String[count+1];
        int idx=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c==' ') {
                res[idx++]=sb.toString();
                sb.setLength(0);
            } else sb.append(c);
        }
        res[idx]=sb.toString();
        return res;
    }
}
