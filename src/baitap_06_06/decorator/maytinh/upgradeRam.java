package baitap_06_06.decorator.maytinh;

public class upgradeRam extends DecoratorPC {
    String n_ram;
    int nval_ram;

    public upgradeRam(PC pc, String n_ram, int nval_ram) {
        super(pc);
        this.n_ram = n_ram;
        this.nval_ram = nval_ram;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        System.out.println(pc.build());
        builder.append("Nang cap ram them: " + n_ram);
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + nval_ram;
    }

    @Override
    public int getVal_ram() {
        return super.getVal_ram() + nval_ram;
    }
}
