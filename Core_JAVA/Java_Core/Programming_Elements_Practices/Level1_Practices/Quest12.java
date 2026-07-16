import java.util.Scanner;

public class Quest12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in inches: ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }
}
