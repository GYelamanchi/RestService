package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/items")
    public List<Item> getItems() {

        return itemRepository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/item")
    public Item getItem(@RequestParam(value="name") String name){
        return itemRepository.findByName("Gulab Jamun");
    }

    @RequestMapping(value = "/item/{name}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable String name) {
        itemRepository.deleteByName(name);
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public void create(@RequestBody Item item) {
        itemRepository.save(item);
    }

    }