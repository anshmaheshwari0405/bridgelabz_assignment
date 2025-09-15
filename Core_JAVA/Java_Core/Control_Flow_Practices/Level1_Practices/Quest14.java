import java.util.*;

public class Quest14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        } else {
            System.out.println("The number " + num + " is not a natural number");
        }

        sc.close();
    }
}
