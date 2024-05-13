package bai_tap.decorator;

public class UpdateCPU extends DecoratorPC{
    String n_cpu;
    int nvalue_cpu;

    public UpdateCPU(PC pc, String n_cpu, int nvalue_cpu) {
        super(pc);
        this.n_cpu = n_cpu;
        this.nvalue_cpu = nvalue_cpu;
    }

    @Override
    public String getCpu() {
        return n_cpu;
    }

    @Override
    public int getV_cpu() {
        return nvalue_cpu;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        System.out.println("Thay thế CPU thành: " + n_cpu);
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - super.getV_cpu() + nvalue_cpu;
    }
}
