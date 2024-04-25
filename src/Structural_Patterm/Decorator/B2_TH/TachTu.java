package Structural_Patterm.Decorator.B2_TH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements MyTokennize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokennize() {
        String[] list = s.toLowerCase().split( " ");
        List<String> arrList = new ArrayList<>(Arrays.asList(list)); // cach1
//        for(String s: list)  -> Cach 2
//            arrList.add(s);
        return arrList;
    }

}
