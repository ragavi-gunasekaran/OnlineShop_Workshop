package lexicon.workshop;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private double totalOrderPrice;
    private ArrayList<Product> productList;
    private Customer customer;

    public Order(Customer customer, ArrayList<Product> productList, int orderId) {
        //To Check if products are null
        if (productList == null || productList.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one product");
        }
        this.customer = customer;
        this.productList = productList;
        this.orderId = orderId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public void calculateTotalOrderPrice(){
        //resetting the order price to 0 before calculating each order
        totalOrderPrice = 0;

        System.out.println("===========================================");
        System.out.println("Summary Of the Order :" + orderId);
        System.out.println("Customer Details : ");
        System.out.println("Name of the customer : " + customer.getCustomerName());
        System.out.println("Email id : " + customer.getCustomerEmail());
        System.out.println("Customer ID : " + customer.getCustomerId());
        System.out.println("Order Details : ");
        System.out.println("Number of Products Ordered : " + productList.size());
        System.out.println("List of Products Ordered : ");
        for (Product product : productList){
            totalOrderPrice += product.getProductPrice();
            System.out.print("Product Name : "+ product.getProductName() + "  ");
            System.out.print("|  Price : " + product.getProductPrice() + " SEK");
            System.out.println();
        }
        System.out.println("Sum of total ordered products price : " + totalOrderPrice);

    }
}
