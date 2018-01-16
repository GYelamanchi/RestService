package MyRestaurant;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Order{

    @Id
    private String orderId;
    private CartItem[] items;
    private int total;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    public Order(){}

    public Order(String orderId, CartItem[] items,Date date, int total){
        this.orderId=orderId;
        this.items=items;
        this.date=date;
        this.total=total;
    }

    public int getTotal(){
        return this.total;
    }
    public String getOrderId(){
        return this.orderId;
    }
    public CartItem[] getItems(){
        return this.items;
    }
    public Date getDate(){
        return this.date;
    }
    public void setTotal(int total){
        this.total=total;
    }
    public void setOrderId(String orderId){
        this.orderId=orderId;
    }
}