import java.util.Scanner;
public class NumberSignChecker {
    public static int checkSign(int number) {
        if (number < 0) return -1;
        if (number > 0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkSign(num));
        sc.close();
    }
}
