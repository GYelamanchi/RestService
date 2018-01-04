package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/items")
    public List<Item> getItems() {
        Item item1;
        Item item2;

        item1 = new Item(1,"chilli chicken", 15, "Boneless chicken with spices");
        item2 = new Item(2,"Gulab Jamun", 10, "Made of powdered milk");

        List<Item> items = new ArrayList<Item>();
        items.add(item1);
        items.add(item2);

        return items;
    }
    }