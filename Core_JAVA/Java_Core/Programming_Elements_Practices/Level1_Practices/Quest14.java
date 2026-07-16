import java.util.Scanner;

public class Quest14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance " + distanceInFeet + " feet is equal to " + yards + " yards and " + miles + " miles");
    }
}
