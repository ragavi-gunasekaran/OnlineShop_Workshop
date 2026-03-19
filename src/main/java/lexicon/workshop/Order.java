package lexicon.workshop;

public class Order {

    private int orderId;
    private double totalOrderPrice;

    public Order(int orderId, double totalOrderPrice) {
        this.orderId = orderId;
        this.totalOrderPrice = totalOrderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", totalOrderPrice=" + totalOrderPrice +
                '}';
    }
}
