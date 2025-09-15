import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0-height, 1-weight, 2-BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height, weight;
            while (true) {
                System.out.println("Enter height (in meters) and weight (in kg) for person " + (i + 1) + ":");
                height = sc.nextDouble();
                weight = sc.nextDouble();
                if (height > 0 && weight > 0) break;
                System.out.println("Invalid input. Enter positive values.");
            }
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
