package bai_tap.decorator;

public abstract class DecoratorPC extends PC{
    PC pc;

    public DecoratorPC(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
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
    public int getV_mainboard() {
        return pc.getV_mainboard();
    }

    @Override
    public int getV_cpu() {
        return pc.getV_cpu();
    }



    @Override
    public int getV_ram() {
        return pc.getV_ram();
    }

    @Override
    public int getV_storage() {
        return pc.getV_storage();
    }

    @Override
    public int getV_screen() {
        return pc.getV_screen();
    }


}
