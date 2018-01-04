package hello;
public class Item{

    private final long id;
    private final String name;
    private final long price;
    private final String description;


    public Item(long id, String name, long price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public long getId() {
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