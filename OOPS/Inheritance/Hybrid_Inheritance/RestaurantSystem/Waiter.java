package RestaurantSystem;

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers and taking orders.");
        System.out.println("-------------------------");
    }
}