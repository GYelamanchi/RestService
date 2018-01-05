package hello;

import org.springframework.data.annotation.Id;

public class Item{

    @Id
    private final String id;
    private final String name;
    private final long price;
    private final String description;

    public Item(String id, String name, long price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
}