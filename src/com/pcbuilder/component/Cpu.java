package com.pcbuilder.component;

public class Cpu extends Component{
    public Cpu(String nama, double harga){
        super(nama, harga);
    }

    public void displayInfo() {
        System.out.printf("CPU: %s - %.2f%n", getNama(), getHarga());
    }
}
