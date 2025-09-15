import java.util.Scanner;
public class RunningRounds5km {
    public static double roundsForDistance(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        double target = 5000.0;
        return target / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rounds = roundsForDistance(a, b, c);
        System.out.println(rounds);
        sc.close();
    }
}
