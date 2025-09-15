import java.util.*;
public class ScoreCard {
    public static int[][] generateScores(int students){
        int[][] s=new int[students][3];
        for(int i=0;i<students;i++){
            s[i][0]=(int)(Math.random()*90)+10;
            s[i][1]=(int)(Math.random()*90)+10;
            s[i][2]=(int)(Math.random()*90)+10;
        }
        return s;
    }
    public static double[][] totals(int[][] s){
        double[][] out=new double[s.length][3];
        for(int i=0;i<s.length;i++){
            int tot=s[i][0]+s[i][1]+s[i][2];
            double avg = Math.round((tot/3.0)*100.0)/100.0;
            double perc = Math.round((tot/300.0*100.0)*100.0)/100.0;
            out[i][0]=tot; out[i][1]=avg; out[i][2]=perc;
        }
        return out;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] s = generateScores(n);
        double[][] t = totals(s);
        System.out.println("P	C	M	Total	Avg	%");
        for(int i=0;i<n;i++){
            System.out.println(s[i][0]+"	"+s[i][1]+"	"+s[i][2]+"	"+(int)t[i][0]+"	"+t[i][1]+"	"+t[i][2]);
        }
        sc.close();
    }
}
