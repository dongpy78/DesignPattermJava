package DecoratorOnTapThi.computer;

public class UpgradeCPU extends PCDecarator{
    // thay thế
    String nCPU;
    int nvCPU;

    public UpgradeCPU(PC pc, String nCPU, int nvCPU) {
        super(pc);
        this.nCPU = nCPU;
        this.nvCPU = nvCPU;
    }

    @Override
    public String getCpu() {
        return nCPU;
    }

    @Override
    public int getVcpu() {
        return nvCPU;
    }

    @Override
    public String build() {
        return "";
    }

    @Override
    public int value() {
        return pc.value() - super.getVcpu() + nvCPU; // bỏ cái cũ ra
    }
}
