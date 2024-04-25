package Creational_Patterm.FactoryMethod.Pizza;

public class VN_PizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType p) {
        Pizza pizza = null;
        if (p == PizzaType.HAISAN) {
            pizza = new HaiSanPizza();
        } else if (p == PizzaType.NAM) {
            // Khởi tạo pizza loại Nam (nếu cần)
        } else if (p == PizzaType.BO) {
            // Khởi tạo pizza loại Bò (nếu cần)
        } else if (p == PizzaType.CHUOTDONG) {
            // Khởi tạo pizza loại Chuột Đồng (nếu cần)
        }
        return pizza;
    }
}
