package BaiTapTuLuyen.LuyenTap.code.iterator;

public class ArrayAggregate<T> extends Aggregate<T> {
    private final T arr[];

    public ArrayAggregate(T[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator<T> createIterator() {
        return null;
    }
}
