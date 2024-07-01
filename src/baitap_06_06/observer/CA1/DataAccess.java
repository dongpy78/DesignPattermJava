package baitap_06_06.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    Stream<List<MonHoc>> stream;
    List<MonHoc> list = new ArrayList<>();

    public DataAccess(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void them(MonHoc m) {
        list.add(m);
        stream.addEvent(list);
    }
    public void xoa(String id) {
        for(var c: list) {
            if(c.id.equals(id)) {
                list.remove(c);
                stream.addEvent(list);
            }
        }
    }
}
