import java.util.Scanner;
public class VowelConsonantType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = types(s);
        for(String[] r: res) System.out.println(r[0] + " " + r[1]);
        sc.close();
    }
    static String[][] types(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            String type = "Not a Letter";
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                char lc = (ch>='A'&&ch<='Z')?(char)(ch+32):ch;
                if(lc=='a'||lc=='e'||lc=='i'||lc=='o'||lc=='u') type = "Vowel"; else type = "Consonant";
            }
            sb.append(ch).append(":").append(type).append(";") ;
        }
        String[] parts = sb.toString().split(";"); 
        String[][] out = new String[parts.length][2];
        for(int i=0;i<parts.length;i++) {
            String[] p = parts[i].split(":",2);
            out[i][0]=p[0];
            out[i][1]=p[1];
        }
        return out;
    }
}
