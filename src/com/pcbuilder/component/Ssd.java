package com.pcbuilder.component;

public class Ssd extends Component{
    private int ukuran;

    public Ssd(String nama, double harga){
        this(nama, harga, 0);
    }

    public Ssd(String nama, double harga, int ukuran){
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public void displayInfo(){
        System.out.println("Nama : " + getNama() + " Ukuran : " + ukuran);
    }
}
