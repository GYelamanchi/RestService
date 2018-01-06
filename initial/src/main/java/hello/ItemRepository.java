package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

    public Item findByName(String name);
    public List<Item> findByPrice(long price);
    public void deleteByName(String name);
    public void deleteItemByPrice(long price);
}