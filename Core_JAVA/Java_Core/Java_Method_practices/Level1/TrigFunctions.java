import java.util.Scanner;
public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double r = Math.toRadians(angleDegrees);
        double s = Math.sin(r);
        double c = Math.cos(r);
        double t = Math.tan(r);
        return new double[] {s, c, t};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("sin: " + res[0]);
        System.out.println("cos: " + res[1]);
        System.out.println("tan: " + res[2]);
        sc.close();
    }
}
