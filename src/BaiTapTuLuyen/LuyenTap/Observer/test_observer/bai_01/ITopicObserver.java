package BaiTapTuLuyen.LuyenTap.Observer.test_observer.bai_01;

public interface ITopicObserver {
    public void receiveNewTopic(String s);
    public void updateTopic(int i, String s);
}
