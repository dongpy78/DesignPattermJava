package baitap_04_06.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
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
