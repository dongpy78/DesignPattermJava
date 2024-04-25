package Structural_Patterm.Decorator.B2_TH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends TokennizeDecarator {
    List<String> stopWords;

    public RemoveStopWord(MyTokennize token) {
        super(token);
        String[] sws = {"thi", "ma", "la"};
        stopWords = new ArrayList<>(Arrays.asList(sws));

    }

    @Override
    public List<String> tokennize() {
        List<String> list = token.tokennize();
        list.removeAll(stopWords);
        return list;
    }
}
