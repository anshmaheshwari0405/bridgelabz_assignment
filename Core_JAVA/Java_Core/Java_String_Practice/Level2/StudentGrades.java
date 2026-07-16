import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = randomScores(n);
        String[][] report = computeReport(scores);
        for(String[] r: report) {
            for(String c: r) System.out.print(c+" ");
            System.out.println();
        }
        sc.close();
    }
    static int[][] randomScores(int n) {
        int[][] out = new int[n][3];
        for(int i=0;i<n;i++) {
            out[i][0]=50+(int)(Math.random()*51);
            out[i][1]=50+(int)(Math.random()*51);
            out[i][2]=50+(int)(Math.random()*51);
        }
        return out;
    }
    static String[][] computeReport(int[][] s) {
        String[][] out = new String[s.length][6];
        for(int i=0;i<s.length;i++) {
            int total = s[i][0]+s[i][1]+s[i][2];
            double avg = Math.round((total/3.0)*100.0)/100.0;
            double perc = Math.round((total/300.0*100.0)*100.0)/100.0;
            String grade = perc>=90?"A":perc>=75?"B":perc>=60?"C":"F";
            out[i][0]=String.valueOf(s[i][0]);
            out[i][1]=String.valueOf(s[i][1]);
            out[i][2]=String.valueOf(s[i][2]);
            out[i][3]=String.valueOf(total);
            out[i][4]=String.valueOf(avg);
            out[i][5]=grade;
        }
        return out;
    }
}
