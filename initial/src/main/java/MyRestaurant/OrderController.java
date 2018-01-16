package MyRestaurant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")

public class OrderController{
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/{orderId}", method=RequestMethod.GET)
    public Order getOrder(@PathVariable String orderId){
        return orderService.getOrder(orderId);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
}
