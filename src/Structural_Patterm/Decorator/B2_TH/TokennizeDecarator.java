package Structural_Patterm.Decorator.B2_TH;

import java.util.List;

public abstract class TokennizeDecarator implements MyTokennize{
    MyTokennize token;

    public TokennizeDecarator(MyTokennize token) {
        this.token = token;
    }

    @Override
    public List<String> tokennize() {
        return null;
    }
}
