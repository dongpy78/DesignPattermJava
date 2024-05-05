package BaiTapTuLuyen.LuyenTap.code.observer.ex_topic;

public interface ITopicObserver {
    public void recieveNewTopic(String s);
    public void updateTopic(int i, String s);
}
