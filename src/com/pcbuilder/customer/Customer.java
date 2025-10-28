package com.pcbuilder.customer;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String id;
    private List<Double> purchases = new ArrayList<>();

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getNama() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Double> getPurchases() {
        return purchases;
    }

    public void addPurchase(double amount) {
        purchases.add(amount);
    }

    public void generateSalesReport() {
        System.out.println("--- Customer Sales Report ---");
        System.out.println("Name: " + this.getNama());
        System.out.println("ID: " + this.getId());
        double total = 0;
        for (Double d : this.purchases) {
            total += d;
        }
        System.out.println("Purchases: " + this.purchases.size());
        System.out.println("Total: " + total);
        System.out.println("-----------------------------");
    }
}