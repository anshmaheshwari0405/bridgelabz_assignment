import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = randomAges(n);
        String[][] out = checkVoting(ages);
        for(String[] r: out) System.out.println(r[0] + " " + r[1]);
        sc.close();
    }
    static int[] randomAges(int n) {
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = 10 + (int)(Math.random()*90);
        return a;
    }
    static String[][] checkVoting(int[] ages) {
        String[][] res = new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            res[i][1]= (ages[i]>=18) ? "true" : "false";
        }
        return res;
    }
}
