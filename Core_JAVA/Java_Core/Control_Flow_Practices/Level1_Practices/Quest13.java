import java.util.*;

public class Quest13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            if (sumFormula == sumFor) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("Mismatch in computations");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
