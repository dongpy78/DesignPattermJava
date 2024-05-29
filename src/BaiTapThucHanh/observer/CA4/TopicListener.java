package BaiTapThucHanh.observer.CA4;

public interface TopicListener {
    public void listen(TinTuc t);
    public void update(int i, TinTuc t);
}
