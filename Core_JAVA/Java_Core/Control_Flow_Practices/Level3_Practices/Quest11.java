import java.util.*;

public class Quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date");
            sc.close();
            return;
        }

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;
        int J = y / 100;

        int h = (d + 13*(m + 1)/5 + K + K/4 + J/4 + 5*J) % 7;

        int dayOfWeek = ((h + 6) % 7);

        System.out.println(dayOfWeek);

        sc.close();
    }
}
