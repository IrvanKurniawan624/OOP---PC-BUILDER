package com.pcbuilder.component;

public class Ram extends Component{
    public Ram(String nama, double harga){
        super(nama, harga);
    }

    public void displayInfo() {
        System.out.printf("RAM: %s - %.2f%n", getNama(), getHarga());
    }
}
