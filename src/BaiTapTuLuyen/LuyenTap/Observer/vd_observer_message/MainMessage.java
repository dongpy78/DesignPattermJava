package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

public class MainMessage {
    public static void main(String[] args) {
        MessageSubcribleOne ms1 = new MessageSubcribleOne();
        MessageSubcribleTwo ms2 = new MessageSubcribleTwo();
        MessageSubcribleThree ms3 = new MessageSubcribleThree();

        MessagePushliser p = new MessagePushliser();

        p.attach(ms1);
        p.attach(ms2);
        p.attach(ms3);
        p.notifyUpdate(new Message("Thông báo đầu tiên!")); // s1 và s2 sẽ nhận giá trị của Message


        p.detach(ms1);
        p.detach(ms3);

        p.notifyUpdate(new Message("Thông báo thứ 2!"));
    }
}
