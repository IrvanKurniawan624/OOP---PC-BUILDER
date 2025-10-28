package com.pcbuilder.component;

public class Motherboard extends Component{
    public Motherboard(String name, double harga) {
        super(name, harga);
    }

    public void displayInfo() {
        System.out.printf("Motherboard: %s - %.2f%n", getNama(), getHarga());
    }
}
