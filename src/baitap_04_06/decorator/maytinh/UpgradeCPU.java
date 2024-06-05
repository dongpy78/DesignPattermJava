package baitap_04_06.decorator.maytinh;

public class UpgradeCPU extends PCDecorator {
    String nCpu;
    int nval_Cpu;

    public UpgradeCPU(PC pc, String nCpu, int nval_Cpu) {
        super(pc);
        this.nCpu = nCpu;
        this.nval_Cpu = nval_Cpu;
    }

    @Override
    public String build() {
        return null;
    }

    @Override
    public int value() {
        return pc.value() - super.getVal_cpu() + nval_Cpu;
    }
}
