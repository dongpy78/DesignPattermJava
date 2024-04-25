package Structural_Patterm.Decorator.B2_TH;

import java.util.List;

public class Main {

    public static void inDS(List<String> list) {
        for(String s: list) System.out.println(s);
    }

    public static void main(String[] args) {

        String s = "Nha Trang đẹp quá thi ma la ????!!!";
        MyTokennize t = new TachTu(s);
        System.out.println(t.tokennize());
        t = new RemoveStopWord(t);
        System.out.println(t.tokennize());
        t = new RemovePunctuation(t);
        System.out.println(t.tokennize());
    }
}
