package Creational_Patterm.FactoryMethod.Pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new VN_PizzaStore();

        Pizza haisanPizza = pizzaStore.orderPizza(PizzaType.HAISAN);
        System.out.println("Ordered Pizza: " + haisanPizza);
    }
}
