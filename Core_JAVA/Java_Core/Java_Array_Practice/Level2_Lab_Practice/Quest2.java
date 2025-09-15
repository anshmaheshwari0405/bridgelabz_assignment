import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        int minAgeIndex = 0;
        double maxHeight = heights[0];
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxHeightIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[minAgeIndex]);
        System.out.println("Tallest friend: " + names[maxHeightIndex]);
        sc.close();
    }
}
