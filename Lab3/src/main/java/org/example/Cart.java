package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private final List<Order> orders = new ArrayList<>();
    private final List<Product> listOfProducts;
    public Cart () {
        this.listOfProducts = new ArrayList<>();
    }

    public void addToCart (Product product)
    {
        listOfProducts.add(product);
        System.out.println(product.getName() + " is added");
    }

    public void removeFromCart (Product product)
    {
        if (listOfProducts.remove(product)) {
            System.out.println(product.getName() + " is removed");
        } else {
            System.out.println("not found");
        }
    }

    public void checkout() {
        if (listOfProducts.isEmpty())
        {
            System.out.println("Cart is empty, order can`t created");
            return;
        }

        StringBuilder productsInfo = new StringBuilder();
        for (Product product : listOfProducts)
        {
            productsInfo.append("Id: ").append(product.getId()).append(", ");
            productsInfo.append("Name: ").append(product.getName()).append(", ");
            productsInfo.append("Price: ").append(product.getPrice()).append("\n");
        }


        Order order = new Order(generateOrderId(), productsInfo.toString(), "Pending");
        orders.add(order);


        listOfProducts.clear();

        System.out.println("Order created:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Products: \n" + order.getProducts());
        System.out.println("Status: " + order.getStatus());
    }

    private static int orderIdCounter = 1;
    private int generateOrderId() {
        int orderId = orderIdCounter;
        orderIdCounter++;
        return orderId;
    }

    public String getOrderStatus(int orderId)
    {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order.getStatus();
            }
        }
        return "Order not found.";
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public List<Order> getOrders() {
        return orders;
    }
}