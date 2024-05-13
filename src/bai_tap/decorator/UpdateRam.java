package bai_tap.decorator;


public class UpdateRam extends DecoratorPC {
    String nram;
    int nvalue_ram;

    public UpdateRam(PC pc, String nram, int nvalue_ram) {
        super(pc);
        this.nram = nram;
        this.nvalue_ram = nvalue_ram;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        System.out.println("Thông số ban đầu của máy: ");
        builder.append(pc.build());
        builder.append("Nâng cấp Ram thêm: " + nram + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + nvalue_ram;
    }
}
