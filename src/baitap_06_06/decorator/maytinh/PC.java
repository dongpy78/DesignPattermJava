package baitap_06_06.decorator.maytinh;

public abstract class PC {
    String main, cpu, ram, storage, screen;
    int val_main, val_ram, val_storage, val_screen;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
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

    public int getVal_main() {
        return val_main;
    }

    public void setVal_main(int val_main) {
        this.val_main = val_main;
    }

    public int getVal_ram() {
        return val_ram;
    }

    public void setVal_ram(int val_ram) {
        this.val_ram = val_ram;
    }

    public int getVal_storage() {
        return val_storage;
    }

    public void setVal_storage(int val_storage) {
        this.val_storage = val_storage;
    }

    public int getVal_screen() {
        return val_screen;
    }

    public void setVal_screen(int val_screen) {
        this.val_screen = val_screen;
    }

    public abstract String build();
    public abstract int value();
}
