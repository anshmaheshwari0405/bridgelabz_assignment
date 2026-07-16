public class Quest6 {

    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The Discounted Amount is INR " + discount);
        System.out.println("The Discounted Price the student will pay is INR " + finalFee);
    }
}
