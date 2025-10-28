package com.pcbuilder.reporting;
import com.pcbuilder.customer.Customer;

public class SalesReport {
    public void generateCustomerReport(Customer customer) {
        customer.generateSalesReport();
    }
}