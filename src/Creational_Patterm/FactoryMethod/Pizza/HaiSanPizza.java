package Creational_Patterm.FactoryMethod.Pizza;

public class HaiSanPizza extends Pizza {
    @Override
    void prepare() {
        builder.append("Preparing seafood pizza\n");
    }

    @Override
    void bake() {
        builder.append("Baking seafood pizza\n");
    }

    @Override
    void cut() {
        builder.append("Cutting seafood pizza\n");
    }

    @Override
    void box() {
        builder.append("Boxing seafood pizza\n");
    }
}
