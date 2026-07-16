import java.util.*;
public class BonusCalculator {
    public static double[] computeNewSalaryAndBonus(int salary,int years){
        double bonus = years>5 ? salary*0.05 : salary*0.02;
        double newSalary = salary + bonus;
        return new double[]{salary, bonus, newSalary, years};
    }
    public static void main(String[] args){
        double[][] data = new double[10][4];
        double sumOld=0, sumNew=0, sumBonus=0;
        for(int i=0;i<10;i++){
            int sal = (int)((Math.random()*90000)+10000);
            int yrs = (int)(Math.random()*11);
            double[] res = computeNewSalaryAndBonus(sal, yrs);
            data[i]=res;
            sumOld += res[0]; sumBonus += res[1]; sumNew += res[2];
        }
        System.out.println("Old	Years	Bonus	New");
        for(int i=0;i<10;i++) System.out.println((int)data[i][0]+"	"+(int)data[i][3]+"	"+(int)data[i][1]+"	"+(int)data[i][2]);
        System.out.println("Totals Old:"+ (int)sumOld + " TotalBonus:"+ (int)sumBonus + " TotNew:"+ (int)sumNew);
    }
}
