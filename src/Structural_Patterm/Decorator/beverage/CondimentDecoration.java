package Structural_Patterm.Decorator.beverage;

public abstract class CondimentDecoration extends Beverage{ // gia vị được thêm vào đồ uống
    protected Beverage component; // biến này dùng để nhận biết đồ uống cơ bản nào được thêm vào trước đó

    public CondimentDecoration(Beverage component, String description) {
        super(description);
        this.component = component;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
