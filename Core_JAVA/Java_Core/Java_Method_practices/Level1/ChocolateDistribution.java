import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int eachGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        return new int[] {eachGets, remaining};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + res[0]);
        System.out.println("Remaining chocolates: " + res[1]);
        sc.close();
    }
}
