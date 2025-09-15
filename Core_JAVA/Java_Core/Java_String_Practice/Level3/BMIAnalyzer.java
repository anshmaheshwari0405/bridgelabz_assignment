import java.util.Scanner;
public class BMIAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for(int i=0;i<10;i++) {
            hw[i][0]=sc.nextDouble();
            hw[i][1]=sc.nextDouble();
        }
        String[][] out = analyze(hw);
        for(String[] r: out) System.out.println(String.join(" ",r));
        sc.close();
    }
    static String[][] analyze(double[][] hw) {
        String[][] res = new String[hw.length][4];
        for(int i=0;i<hw.length;i++) {
            double weight = hw[i][0];
            double heightm = hw[i][1]/100.0;
            double bmi = Math.round((weight/(heightm*heightm))*100.0)/100.0;
            String status = bmi<18.5?"Underweight":bmi<25?"Normal":bmi<30?"Overweight":"Obese";
            res[i][0]=String.valueOf(hw[i][1]);
            res[i][1]=String.valueOf((int)weight);
            res[i][2]=String.valueOf(bmi);
            res[i][3]=status;
        }
        return res;
    }
}
