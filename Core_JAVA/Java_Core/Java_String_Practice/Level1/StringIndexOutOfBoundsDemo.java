import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generate(s);
        } catch(Exception e) {
            System.out.println("Exception caught");
        }
        sc.close();
    }
    static void generate(String s) {
        System.out.println(s.charAt(s.length()+1));
    }
}
