package BaiTapTuLuyen.LuyenTap.code.iterator;

public abstract class Iterator<T> {
    public abstract T first();
    public abstract T next();
    public abstract boolean isDone();
    public abstract T currentItem();
}
