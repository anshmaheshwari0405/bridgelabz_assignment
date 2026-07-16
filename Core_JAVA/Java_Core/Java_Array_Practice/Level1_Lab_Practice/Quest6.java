import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height: " + mean);
        sc.close();
    }
}
