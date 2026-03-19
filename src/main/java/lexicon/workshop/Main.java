package lexicon.workshop;

import java.util.ArrayList;

public class Main {

    static void main() {

        //Customer details
        Customer customer = new Customer(1,"Ragavi","ragavi@lexicon.com");
        Customer customer2 = new Customer(2,"Shanmu","shanmu@lexicon.com");
        Customer customer3 = new Customer(3,"Muthana","muthana@lexicon.com");
        Customer customer4 = new Customer(4,"Sikdar","sikdar@lexicon.com");

        //Product details
        Product product1 = new Product(1,"Book",200);
        Product product2 = new Product(2,"Pen",50);
        Product product3 = new Product(3,"Calculator", 300);
        Product product4 = new Product(4,"Head Phone",1000);
        Product product5 = new Product(5,"Laptop",10000);
        Product product6 = new Product(6,"KeyBoard", 600);
        Product product7 = new Product(7,"Television",8000);
        Product product8 = new Product(8,"Refrigerator", 12000);
        Product product9 = new Product(9,"Sofa",7000);
        Product product10 = new Product(10,"Table",2000);
        Product product11 = new Product(11,"Chair", 1250);

        createOrder(customer, 1, createProductList(product1, product2, product3));
        createOrder(customer2, 2, createProductList(product4, product5, product6));
        createOrder(customer3, 3, createProductList(product7, product8));
        createOrder(customer4, 4, createProductList(product9, product10, product11));
    }

    // Created a private method as used only in main and this method is to create the product
    private static Product createProduct(int id, String name, double price) {
        return new Product(id, name, price);
    }

    //This is to add the product to the list
    private static ArrayList<Product> createProductList(Product... products) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product p : products) {
            list.add(p);
        }
        return list;
    }

    //This method is used to create the order with its order details
    private static void createOrder(Customer customer, int orderId, ArrayList<Product> products) {
        Order order = new Order(customer, products, orderId);
        //Calling the calculate method in order class and calculating the price of each order
        order.calculateTotalOrderPrice();
    }
}
