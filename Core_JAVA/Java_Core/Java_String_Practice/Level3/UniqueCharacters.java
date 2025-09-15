import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] u = unique(s);
        for(char c: u) System.out.print(c);
        sc.close();
    }
    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int idx=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c) {found=true;break;}
            if(!found) temp[idx++]=c;
        }
        char[] res = new char[idx];
        System.arraycopy(temp,0,res,0,idx);
        return res;
    }
}
