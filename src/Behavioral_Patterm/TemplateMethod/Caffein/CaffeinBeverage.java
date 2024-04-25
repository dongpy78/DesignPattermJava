package Behavioral_Patterm.TemplateMethod.Caffein;

public abstract class CaffeinBeverage {
    protected abstract void brew();
    protected abstract void addCondiment();
    private void boilWater() {
        System.out.println("Đun nước sôi!");
    }

    private void pourCup() {
        System.out.println("Đổ nước sôi vào cốc!");
    }

    public void prepreRecipe() {
        boilWater();
        pourCup();
        brew();
        addCondiment();

    }
}
