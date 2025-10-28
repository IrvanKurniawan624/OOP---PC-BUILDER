package com.pcbuilder.component;

public abstract class Component{
    private String nama;
    private double harga;

    public Component(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public String getName(){
        return nama;
    }

    public double getHarga(){
        return harga; 
    }

    public abstract void displayInfo();
}
