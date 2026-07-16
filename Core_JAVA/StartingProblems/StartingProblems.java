import java.util.Scanner;

public class ProblemSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a task:");
        System.out.println("1. Welcome");
        System.out.println("2. Add Two Numbers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Area of a Circle");
        System.out.println("5. Volume of a Cylinder");
        System.out.println("6. Simple Interest");
        System.out.println("7. Perimeter of a Rectangle");
        System.out.println("8. Power Calculation");
        System.out.println("9. Average of Three Numbers");
        System.out.println("10. Kilometers to Miles");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            welcome();
        } else if (choice == 2) {
            addTwoNumbers(sc);
        } else if (choice == 3) {
            celsiusToFahrenheit(sc);
        } else if (choice == 4) {
            areaOfCircle(sc);
        } else if (choice == 5) {
            volumeOfCylinder(sc);
        } else if (choice == 6) {
            simpleInterest(sc);
        } else if (choice == 7) {
            perimeterOfRectangle(sc);
        } else if (choice == 8) {
            powerCalculation(sc);
        } else if (choice == 9) {
            averageOfThree(sc);
        } else if (choice == 10) {
            kmToMiles(sc);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

    static void welcome() {
        System.out.println("Welcome to Bridgelabz!");
    }

    static void addTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("The sum is: " + (a + b));
    }

    static void celsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }

    static void areaOfCircle(Scanner sc) {
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of the circle: " + area);
    }

    static void volumeOfCylinder(Scanner sc) {
        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder: " + volume);
    }

    static void simpleInterest(Scanner sc) {
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();
        double si = (p * rate * t) / 100;
        System.out.println("Simple Interest: " + si);
    }

    static void perimeterOfRectangle(Scanner sc) {
        System.out.print("Enter length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    static void powerCalculation(Scanner sc) {
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exp = sc.nextDouble();
        double result = Math.pow(base, exp);
        System.out.println(base + " raised to " + exp + " is: " + result);
    }

    static void averageOfThree(Scanner sc) {
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter third number: ");
        double z = sc.nextDouble();
        double avg = (x + y + z) / 3;
        System.out.println("Average of the three numbers: " + avg);
    }

    static void kmToMiles(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}