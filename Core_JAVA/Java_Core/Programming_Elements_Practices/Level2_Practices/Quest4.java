import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distanceInFeet = input.nextInt();
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
