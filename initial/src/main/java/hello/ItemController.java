package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getItems() {
        return itemRepository.findAll();
    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Item getItem(@PathVariable(value="name") String name){
        return itemRepository.findByName(name);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable String name) {
        itemRepository.deleteByName(name);
    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Item item) {
        itemRepository.save(item);
    }

    }