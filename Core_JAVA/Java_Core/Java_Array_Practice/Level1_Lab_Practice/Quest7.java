import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Enter a natural number");
            return;
        }
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
        sc.close();
    }
}

