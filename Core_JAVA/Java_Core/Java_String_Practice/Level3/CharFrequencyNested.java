import java.util.Scanner;
public class CharFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] out = freqNested(s);
        for(String r: out) System.out.println(r);
        sc.close();
    }
    static String[] freqNested(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='0') continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) { count++; arr[j]='0'; }
            }
            sb.append(arr[i]).append(" ").append(count).append(";") ;
        }
        String[] parts = sb.toString().split(";"); 
        return parts;
    }
}
