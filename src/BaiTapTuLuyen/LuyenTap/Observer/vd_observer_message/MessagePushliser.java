package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

import java.util.ArrayList;
import java.util.List;

public class MessagePushliser implements Subject{
    // Định nghĩa một danh sách observers có nghĩa là những subcriber và lưu lại những
    // subcriber đăng ký lắng nghe sự kiện từ MessagePushliser
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(var c: observers) {
            c.update(m);;
        }
    }
}
