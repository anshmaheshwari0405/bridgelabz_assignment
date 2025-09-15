import java.util.*;

public class Quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();

        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();

        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        // Youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Anthony is the youngest");
        } else {
            System.out.println("Two or more friends have the same youngest age");
        }

        // Tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Anthony is the tallest");
        } else {
            System.out.println("Two or more friends have the same tallest height");
        }

        sc.close();
    }
}
