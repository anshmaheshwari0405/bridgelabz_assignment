import java.util.Scanner;
public class StringLengthManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(length(s));
        sc.close();
    }
    static int length(String s) {
        int i=0;
        try {
            while(true) {
                s.charAt(i);
                i++;
            }
        } catch(Exception e) {
            return i;
        }
    }
}
