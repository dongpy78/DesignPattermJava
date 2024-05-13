package bai_tap.decorator;

public class ConcretePC extends PC{
    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int v_mainboard, int v_cpu, int v_ram, int v_storage, int v_screen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.v_mainboard = v_mainboard;
        this.v_cpu = v_cpu;
        this.v_ram = v_ram;
        this.v_storage = v_storage;
        this.v_screen = v_screen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Main board: " + mainboard + "\n")
                .append("Cpu: " + cpu + "\n")
                .append("Ram: " + ram + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return v_cpu + v_mainboard + v_storage + v_screen + v_ram;
    }
}
