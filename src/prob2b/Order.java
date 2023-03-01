package prob2b;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID orderNum;
    private List<OrderLine> lines;

    public Order(UUID orderNum, List<OrderLine> lines) {
        if (lines.isEmpty()) {
            throw new RuntimeException("Can not create new Order!");
        }
        this.orderNum = orderNum;
        this.lines = lines;
    }

    public void addLine(String name, double price) {
        List<OrderLine> lineList = new ArrayList<>(this.getLines());
        lineList.add(new OrderLine(name, price));
        this.setLines(lineList);
    }

    public UUID getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(UUID orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public void setLines(List<OrderLine> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", lines=" + lines +
                '}';
    }
}
