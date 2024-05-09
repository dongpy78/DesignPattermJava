package DecoratorOnTapThi.computer;

public class ConcretePC extends PC {
//    String mainboard, cpu, ram, storage, screen;
//    int Vmainboard, Vcpu, Vram, Vstorage, Vscreen;

    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int vmainboard, int vcpu, int vram, int vstorage, int vscreen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        Vmainboard = vmainboard;
        Vcpu = vcpu;
        Vram = vram;
        Vstorage = vstorage;
        Vscreen = vscreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Main board: " + mainboard + "\n").append("CPU: " + cpu + "\n")
                .append("Screen: " + screen + "\n").append("Ram: " + ram + "\n").
                append("Storage: " + storage + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return Vmainboard+Vcpu+Vscreen+Vram+Vstorage;
    }
}
