package DecoratorOnTapThi.computer;

public abstract class PC {
    String mainboard, cpu, ram, storage, screen;
    int Vmainboard, Vcpu, Vram, Vstorage, Vscreen;

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getVmainboard() {
        return Vmainboard;
    }

    public void setVmainboard(int vmainboard) {
        Vmainboard = vmainboard;
    }

    public int getVcpu() {
        return Vcpu;
    }

    public void setVcpu(int vcpu) {
        Vcpu = vcpu;
    }

    public int getVram() {
        return Vram;
    }

    public void setVram(int vram) {
        Vram = vram;
    }

    public int getVstorage() {
        return Vstorage;
    }

    public void setVstorage(int vstorage) {
        Vstorage = vstorage;
    }

    public int getVscreen() {
        return Vscreen;
    }

    public void setVscreen(int vscreen) {
        Vscreen = vscreen;
    }

    public abstract String build();
    public abstract int value();

}
