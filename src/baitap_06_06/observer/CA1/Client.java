package baitap_06_06.observer.CA1;

import java.util.List;

public class Client implements StreamData<List<MonHoc>>{
    Stream stream;

    public Client(Stream stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for(var c: monHocs) {
            System.out.println(c.toString());
        }
    }
}
