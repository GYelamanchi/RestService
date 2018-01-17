package MyRestaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public String createOrder(Order order){
        if(isValidOrder(order)) {
            Order createdOrder = orderRepository.save(order);
            return createdOrder.getOrderId();
        }
        return null;
    }

    private boolean isValidOrder(Order order) {
        return true;
    }

    public Order getOrder(String orderId) {
        Order order = orderRepository.findOne(orderId);
        return order;
    }
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
