
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); 
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " has been shipped. Tracking Number: " + trackingNumber;
    }
}


class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); 
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " was delivered on " + deliveryDate;
    }
}

public class OrderManagementTest {
    public static void main(String[] args) {
        Order order = new Order("O1001", "2025-09-01");
        ShippedOrder shippedOrder = new ShippedOrder("O1002", "2025-09-02", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O1003", "2025-09-03", "TRK67890", "2025-09-05");

        Order[] orders = {order, shippedOrder, deliveredOrder};

        for (Order o : orders) {
            System.out.println(o.getOrderStatus());
        }
    }
}
