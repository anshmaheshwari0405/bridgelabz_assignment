import java.util.Scanner;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVC(s);
        System.out.println("Vowels " + res[0]);
        System.out.println("Consonants " + res[1]);
        sc.close();
    }
    static int[] countVC(String s) {
        int v=0,cnt=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                char lc = (ch>='A'&&ch<='Z')?(char)(ch+32):ch;
                if(lc=='a'||lc=='e'||lc=='i'||lc=='o'||lc=='u') v++; else cnt++;
            }
        }
        return new int[]{v,cnt};
    }
}
