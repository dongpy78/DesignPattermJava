package DecoratorOnTapThi.computer;

public class UpgradeRam extends PCDecarator{
    // Yêu cầu thêm vào
    String nRam; // nang cap cai gi
    int nvRam;  // ram bao nhieu

    public UpgradeRam(PC pc, String nRam, int nvRam) {
        super(pc);
        this.nRam = nRam;
        this.nvRam = nvRam;
    }

//    public UpgradeRam(PC pc) {
//        super(pc);
//    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build()); // mô tả cũ
        builder.append("Nâng cấp RAM thêm: " + nRam + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + nvRam;
    }

    @Override
    public String getRam() {
        return super.getRam() + " " + nvRam; // cái cũ + cộng với cái nvRam
    }
}
