package baitap_04_06.decorator.maytinh;

public class UpgradeRam extends PCDecorator {
    String nRam;
    int nval_ram;

    public UpgradeRam(PC pc, String nRam, int nval_ram) {
        super(pc);
        this.nRam = nRam;
        this.nval_ram = nval_ram;
    }




    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp Ram thêm: " + nRam);
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + nval_ram;
    }

    @Override
    public int getVal_ram() {
        return super.getVal_ram();
    }
}
