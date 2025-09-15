import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        sc.close();
    }
}
