public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            generateNull();
        } catch(Exception e) {
            System.out.println("Exception caught");
        }
    }
    static void generateNull() {
        String s = null;
        s.length();
    }
}
