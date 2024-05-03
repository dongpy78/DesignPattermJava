package BaiTapTuLuyen.LuyenTap.Observer.vd_observer_message;

public interface Subject {

    void attach(Observer o); // Thêm một cái subcriber(người đăng ký)
    void detach(Observer o); // Loại bỏ subcriber(người đăng ký)
    void notifyUpdate(Message m);


}
