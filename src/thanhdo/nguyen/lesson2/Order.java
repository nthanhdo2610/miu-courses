package thanhdo.nguyen.lesson2;

import java.util.Date;
import java.util.List;

public class Order {

    private List<Object> items;
    private Date createdDate;

    public Order(List<Object> items, Date createdDate) {
        this.items = items;
        this.createdDate = createdDate;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", createdDate=" + createdDate +
                '}';
    }
}
