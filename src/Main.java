import com.pcbuilder.core.Pc;
import com.pcbuilder.component.*;

public class Main {
    public static void main(String[] args) {
        Pc myPc = new Pc(
            "Gigabyte Asrock BM450", 300000,
            "Ryzen 5 5600H", 450000,
            "Corsair 16GB", 120000
        );

        Component ssd = new Ssd("SSD Adata 500GB", 200000);
        Component mouse = new Mouse("Logitech M330", 150000);
        myPc.addComponent(ssd);
        myPc.addComponent(mouse);

        myPc.generateReport();
        System.out.println();
        System.out.println("--- List Components ---");
        myPc.showTotalPrice();
    }
}