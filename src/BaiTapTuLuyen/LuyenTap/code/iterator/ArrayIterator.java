package BaiTapTuLuyen.LuyenTap.code.iterator;

public class ArrayIterator<T> extends Iterator<T>{
    private final ArrayIterator<T> agg;

    public ArrayIterator(ArrayIterator<T> agg) {
        this.agg = agg;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public T currentItem() {
        return null;
    }
}
