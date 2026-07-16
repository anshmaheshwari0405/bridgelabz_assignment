import java.util.Scanner;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        sc.close();
    }
}
