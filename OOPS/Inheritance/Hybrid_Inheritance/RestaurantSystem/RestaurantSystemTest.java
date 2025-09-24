package RestaurantSystem;

public class RestaurantSystemTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice Johnson", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob Smith", 202, 5);

        // Demonstrating hybrid inheritance
        Worker[] workers = {chef, waiter};

        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
