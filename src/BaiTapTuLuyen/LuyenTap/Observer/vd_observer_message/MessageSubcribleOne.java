package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

public class MessageSubcribleOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Message SubcribleOne: " + m.getM());
    }
}
