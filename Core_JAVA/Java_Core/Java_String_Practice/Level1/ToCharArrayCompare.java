import java.util.Arrays;
import java.util.Scanner;
public class ToCharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] mine = toCharArray(s);
        char[] builtin = s.toCharArray();
        System.out.println(Arrays.equals(mine,builtin));
        sc.close();
    }
    static char[] toCharArray(String s) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i);
        return arr;
    }
}
