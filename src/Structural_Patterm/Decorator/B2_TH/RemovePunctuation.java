package Structural_Patterm.Decorator.B2_TH;

import java.util.ArrayList;
import java.util.List;

public class RemovePunctuation extends TokennizeDecarator{

    public RemovePunctuation(MyTokennize token) {
        super(token);
    }

    @Override
    public List<String> tokennize() {
        // Cach 1
        List<String> list = token.tokennize();
        list.replaceAll(s -> s.replaceAll("[\\p{Punct}]", ""));
        return list;

        // Cach 2
//        List<String> nList = new ArrayList<>();
//        for(String s: list) {
//            String t = s.replaceAll("[\\p{Punct}]", "");
//            nList.add(t);
//        }
//        return nList;
    }
}








