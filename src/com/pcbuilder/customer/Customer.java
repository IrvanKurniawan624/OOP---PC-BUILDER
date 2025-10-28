package com.pcbuilder.customer;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String nama;
    private String id;
    private List<Double> purchases = new ArrayList<>();

    public Customer(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
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
        System.out.println("Nama: " + this.getNama());
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