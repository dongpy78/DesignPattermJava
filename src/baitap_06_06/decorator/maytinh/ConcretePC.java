package baitap_06_06.decorator.maytinh;

public class ConcretePC extends PC{
    String main, cpu, ram, storage, screen;
    int val_main, val_ram, val_storage, val_screen;

    public ConcretePC(String main, String cpu, String ram, String storage, String screen, int val_main, int val_ram, int val_storage, int val_screen) {
        this.main = main;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.val_main = val_main;
        this.val_ram = val_ram;
        this.val_storage = val_storage;
        this.val_screen = val_screen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Main board: " + main + "\n").append("CPU: " + cpu + "\n")
                .append("Screen: " + screen + "\n").append("Ram: " + ram + "\n").
                append("Storage: " + storage + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return val_main + val_ram + val_storage + val_screen;
    }
}
