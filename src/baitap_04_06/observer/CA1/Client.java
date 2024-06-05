package baitap_04_06.observer.CA1;

import java.util.List;

public class Client implements StreamListener<List<MonHoc>> {
    MyStream stream;

    public Client(MyStream stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(var c: monHocs)
            System.out.println(c.toString());
    }
}
