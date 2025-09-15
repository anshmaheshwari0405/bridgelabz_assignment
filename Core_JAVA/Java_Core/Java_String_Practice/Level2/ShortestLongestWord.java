import java.util.Scanner;
public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = splitWords(line);
        String shortest = words[0], longest = words[0];
        for(String w: words) {
            if(w.length() < shortest.length()) shortest = w;
            if(w.length() > longest.length()) longest = w;
        }
        System.out.println(shortest);
        System.out.println(longest);
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
