import java.util.Scanner;
public class SumNaturalNumbers {
    public static long sumUpToN(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumUpToN(n));
        sc.close();
    }
}
