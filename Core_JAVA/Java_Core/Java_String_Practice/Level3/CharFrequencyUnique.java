import java.util.Scanner;
public class CharFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] out = freqUnique(s);
        for(String[] r: out) System.out.println(r[0] + " " + r[1]);
        sc.close();
    }
    static String[][] freqUnique(String s) {
        char[] u = unique(s);
        String[][] res = new String[u.length][2];
        for(int i=0;i<u.length;i++) {
            int c=0;
            for(int j=0;j<s.length();j++) if(s.charAt(j)==u[i]) c++;
            res[i][0]=String.valueOf(u[i]);
            res[i][1]=String.valueOf(c);
        }
        return res;
    }
    static char[] unique(String s) {
        char[] tmp = new char[s.length()];
        int idx=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c) {found=true;break;}
            if(!found) tmp[idx++]=c;
        }
        char[] res = new char[idx];
        System.arraycopy(tmp,0,res,0,idx);
        return res;
    }
}
