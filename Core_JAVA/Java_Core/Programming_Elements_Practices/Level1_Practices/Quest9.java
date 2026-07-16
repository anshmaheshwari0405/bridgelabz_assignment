import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
s
        System.out.print("Enter the Student Fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the Discount Percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
