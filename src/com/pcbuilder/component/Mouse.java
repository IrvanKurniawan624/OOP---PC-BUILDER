package com.pcbuilder.component;

public class Mouse extends Component{
    private String type;

    public Mouse(String nama, double harga){
        this(nama, harga, "unknown");
    }

    public Mouse(String nama, double harga, String type){
        super(nama, harga);
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Nama : " + getNama() + " Type : " + type);
    }
}
