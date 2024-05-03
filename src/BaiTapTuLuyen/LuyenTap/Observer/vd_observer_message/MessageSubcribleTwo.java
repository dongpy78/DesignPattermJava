package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

public class MessageSubcribleTwo implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Message SubcribleTwo: " + m.getM());
    }
}
