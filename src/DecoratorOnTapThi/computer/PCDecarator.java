package DecoratorOnTapThi.computer;

public abstract class PCDecarator extends PC {
    PC pc;

    public PCDecarator(PC pc) {
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
    public int getVmainboard() {
        return pc.getVmainboard();
    }

    @Override
    public int getVcpu() {
        return pc.getVcpu();
    }

    @Override
    public int getVram() {
        return pc.getVram();
    }

    @Override
    public int getVstorage() {
        return pc.getVstorage();
    }

    @Override
    public int getVscreen() {
        return pc.getVscreen();
    }
}
