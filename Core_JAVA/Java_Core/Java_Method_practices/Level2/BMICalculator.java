import java.util.*;
public class BMICalculator {
    public static double bmi(double w,double hcm){
        double hm=hcm/100.0;
        return w/(hm*hm);
    }
    public static String status(double bmi){
        if(bmi<18.5)return "Underweight";
        else if(bmi<25)return "Normal";
        else if(bmi<30)return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            double b=bmi(w,h);
            data[i][0]=w; data[i][1]=h; data[i][2]=b;
        }
        for(int i=0;i<10;i++){
            System.out.println("Weight:"+data[i][0]+" Height:"+data[i][1]+" BMI:"+data[i][2]+" Status:"+status(data[i][2]));
        }
        sc.close();
    }
}
