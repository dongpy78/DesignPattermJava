package Behavioral_Patterm.TemplateMethod.Caffein;

public class Caffe extends CaffeinBeverage {
    @Override
    protected void brew() {
        System.out.println("Cho cafe vào và khuấy đều cho tan!");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Them ít đường và một ít sữa!");
    }
}
