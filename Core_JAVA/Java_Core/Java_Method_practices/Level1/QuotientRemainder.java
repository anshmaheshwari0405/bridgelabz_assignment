import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {remainder, quotient};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[1]);
        System.out.println("Remainder: " + res[0]);
        sc.close();
    }
}
