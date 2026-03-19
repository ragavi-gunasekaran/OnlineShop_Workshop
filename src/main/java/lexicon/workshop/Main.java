package lexicon.workshop;

import java.util.ArrayList;

public class Main {

    static void main() {
        Customer customer = new Customer(1,"Ragavi","ragavi@lexicon.com");
        Customer customer2 = new Customer(2,"Shanmu","shanmu@lexicon.com");
        Customer customer3 = new Customer(3,"Muthana","muthana@lexicon.com");
        Customer customer4 = new Customer(4,"Sikdar","sikdar@lexicon.com");

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

        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);

        ArrayList<Product> listOfProducts1 = new ArrayList<>();
        listOfProducts1.add(product4);
        listOfProducts1.add(product5);
        listOfProducts1.add(product6);

        ArrayList<Product> listOfProducts2 = new ArrayList<>();
        listOfProducts2.add(product7);
        listOfProducts2.add(product8);

        ArrayList<Product> listOfProducts3 = new ArrayList<>();
        listOfProducts3.add(product9);
        listOfProducts3.add(product10);
        listOfProducts3.add(product11);

        Order order1 = new Order(customer,listOfProducts,1);
        order1.calculateTotalOrderPrice();
        Order order2 = new Order(customer2,listOfProducts1,2);
        order2.calculateTotalOrderPrice();
        Order order3 = new Order(customer3,listOfProducts2,3);
        order3.calculateTotalOrderPrice();
        Order order4 = new Order(customer4,listOfProducts3,4);
        order4.calculateTotalOrderPrice();
    }
}
