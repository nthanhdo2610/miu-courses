package thanhdo.nguyen.lesson2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Object> items;

    ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }
}
