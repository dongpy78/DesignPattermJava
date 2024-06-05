package baitap_04_06.decorator.maytinh;

public class ConcrePC extends PC{
//    String main, cpu, ram, storage, screen;
//    int val_main, val_cpu, val_storage, val_screen, val_ram;

    public ConcrePC(String main, String cpu, String ram, String storage, String screen, int val_main, int val_cpu, int val_storage, int val_screen, int val_ram) {
        this.main = main;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.val_main = val_main;
        this.val_cpu = val_cpu;
        this.val_storage = val_storage;
        this.val_screen = val_screen;
        this.val_ram = val_ram;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Main: " + main + "\n")
                .append("Cpu: " + cpu + "\n")
                .append("Ram: " + ram + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return val_cpu + val_main + val_screen + val_storage + val_ram;
    }
}
