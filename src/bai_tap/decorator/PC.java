package bai_tap.decorator;

public abstract class PC {
    String mainboard, cpu, ram, storage, screen;
    int v_mainboard, v_cpu, v_ram, v_storage, v_screen;

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

    public int getV_mainboard() {
        return v_mainboard;
    }

    public void setV_mainboard(int v_mainboard) {
        this.v_mainboard = v_mainboard;
    }

    public int getV_cpu() {
        return v_cpu;
    }

    public void setV_cpu(int v_cpu) {
        this.v_cpu = v_cpu;
    }

    public int getV_ram() {
        return v_ram;
    }

    public void setV_ram(int v_ram) {
        this.v_ram = v_ram;
    }

    public int getV_storage() {
        return v_storage;
    }

    public void setV_storage(int v_storage) {
        this.v_storage = v_storage;
    }

    public int getV_screen() {
        return v_screen;
    }

    public void setV_screen(int v_screen) {
        this.v_screen = v_screen;
    }

    public abstract String build();
    public abstract int value();


}
