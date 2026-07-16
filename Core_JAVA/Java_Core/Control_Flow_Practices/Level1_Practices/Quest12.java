import java.util.*;

public class Quest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
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
