package MyRestaurant;

public class CartItem{
    private Item item;
    private int qty;

    public CartItem(){}

    public CartItem(Item item, int qty){
        this.item=item;
        this.qty=qty;
    }

    public Item getItem(){
        return this.item;
    }

    public int getQty(){
        return this.qty;
    }
    public void setItem(Item item){
        this.item=item;
    }
    public void setQty(int qty){
        this.qty=qty;
    }


}