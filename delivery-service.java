import java.util.HashMap;
import java.util.Map;

public class DeliveryService {

    private Map<Integer, String> orders = new HashMap<>();

    public void placeOrder(int orderId) {
        orders.put(orderId, "Placed");
        System.out.println("Order " + orderId + " placed");
    }

    public void assignDelivery(int orderId) {
        orders.put(orderId, "Out for Delivery");
        System.out.println("Order " + orderId + " assigned to delivery partner");
    }

    public void completeOrder(int orderId) {
        orders.put(orderId, "Delivered");
        System.out.println("Order " + orderId + " delivered");
    }

    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        service.placeOrder(101);
        service.assignDelivery(101);
        service.completeOrder(101);
    }
}
