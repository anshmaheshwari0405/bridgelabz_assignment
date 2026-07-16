import java.util.Scanner;
public class WindChillCalculator {
    public static double calculateWindChill(double temperatureF, double windSpeedMph) {
        double t = temperatureF;
        double v = windSpeedMph;
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempF = sc.nextDouble();
        double windMph = sc.nextDouble();
        System.out.println(calculateWindChill(tempF, windMph));
        sc.close();
    }
}
