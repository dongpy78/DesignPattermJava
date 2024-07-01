package baitap_06_06.decorator.maytinh;

public class upgradeCpu extends DecoratorPC {
    String n_cpu;
    int nval_cpu;

    public upgradeCpu(PC pc) {
        super(pc);
    }

    @Override
    public String build() {
        return null;
    }

    @Override
    public int value() {
        return 0;
    }
}
