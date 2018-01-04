package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    @RequestMapping("/items")
    public list<Item> getItems() {

        list<Item> items;
        items.add(item1);
        items.add(item2);

        return items;

        Item item1;
        Item item2;

        item = new item(1,"chilli chicken", 15, "Boneless chicken with spices");
        item = new item(2,"Gulab Jamun", 10, "Made of powdered milk");

    }
    }