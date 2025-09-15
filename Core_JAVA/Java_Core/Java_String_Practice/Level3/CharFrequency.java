import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] out = freq(s);
        for(String[] r: out) System.out.println(r[0]+" " + r[1]);
        sc.close();
    }
    static String[][] freq(String s) {
        int[] f = new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        int count=0;
        for(int i=0;i<256;i++) if(f[i]>0) count++;
        String[][] res = new String[count][2];
        int idx=0;
        for(int i=0;i<256;i++) if(f[i]>0) { res[idx][0]=String.valueOf((char)i); res[idx][1]=String.valueOf(f[i]); idx++; }
        return res;
    }
}
