package com.pcbuilder.core;
import java.util.ArrayList;
import com.pcbuilder.component.*;

public class Pc {
    private ArrayList<Component> components = new ArrayList<>();

    private Motherboard motherboard;
    private Cpu cpu;
    private Ram ram;

    public Pc(String namaMb, double hargaMb, String namaCpu, double hargaCpu, String namaRam, double hargaRam) {
        this.motherboard = new Motherboard(namaMb, hargaMb); 
        this.cpu = new Cpu(namaCpu, hargaCpu);
        this.ram = new Ram(namaRam, hargaRam);
        
        components.add(this.motherboard);
        components.add(this.cpu);
        components.add(this.ram);
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (Component component : this.components) {
            total += component.getHarga();
        }
        return total;
    }

    public void showTotalPrice(){
        System.out.printf("%-30s %-10s%n", "Nama", "Harga");
        System.out.println("----------------------------------------");
        for (Component component : components) {
            System.out.printf("%-30s %-10.2f%n", component.getNama(), component.getHarga());
        }
        System.out.println("----------------------------------------");
        System.out.printf("%-30s %-10.2f%n", "TOTAL", calculateTotalPrice());
    }

    public Cpu getCPU(){
        return cpu;
    }

    public Motherboard getMotherboard(){
        return motherboard;
    }

    public Ram getRam(){
        return ram;
    }

    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        System.out.println("CPU: " + this.getCPU().getName());
        System.out.println("Motherboard: " + this.getMotherboard().getName());
        System.out.println("RAM: " + this.getRam().getName());
        System.out.println("-----------------------");
    }

}
