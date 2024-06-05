package baitap_04_06.decorator.maytinh;

public abstract class PCDecorator extends PC {
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getMain() {
        return pc.getMain();
    }

    @Override
    public String getCpu() {
        return pc.getCpu();
    }

    @Override
    public String getRam() {
        return pc.getRam();
    }

    @Override
    public String getStorage() {
        return pc.getStorage();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public int getVal_main() {
        return pc.getVal_main();
    }

    @Override
    public int getVal_cpu() {
        return pc.getVal_cpu();
    }

    @Override
    public int getVal_storage() {
        return pc.getVal_storage();
    }

    @Override
    public int getVal_screen() {
        return pc.getVal_screen();
    }

    @Override
    public int getVal_ram() {
        return pc.getVal_ram();
    }




}
