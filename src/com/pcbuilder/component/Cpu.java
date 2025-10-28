package com.pcbuilder.component;

public class Cpu extends Component{
    public Cpu(String name, double harga){
        super(name, harga);
    }

    public void displayInfo() {
        System.out.printf("CPU: %s - %.2f%n", getNama(), getHarga());
    }
}
