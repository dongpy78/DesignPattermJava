package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

public class MessageSubcribleThree implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Message SubcribleThree: " + m.getM());
    }
}
