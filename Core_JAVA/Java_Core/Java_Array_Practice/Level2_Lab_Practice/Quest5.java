import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempNumber = number;
        int count = 0;

        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }

        int[] digits = new int[count];
        int[] reversed = new int[count];
        tempNumber = number;

        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        sc.close();
    }
}
