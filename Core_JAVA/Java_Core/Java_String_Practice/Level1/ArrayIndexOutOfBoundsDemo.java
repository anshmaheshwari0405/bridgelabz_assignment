public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        try {
            generate();
        } catch(Exception e) {
            System.out.println("Exception caught");
        }
    }
    static void generate() {
        String[] arr = new String[]{"a","b"};
        System.out.println(arr[5]);
    }
}
