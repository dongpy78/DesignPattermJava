package Behavioral_Patterm.Iterator.test1;

public class ArrayIterator63 implements Iterator63 {
    ArrayCollection63 collection63;
    int index = -1;
    // ph
    protected ArrayIterator63(ArrayCollection63 collection63) {
        this.collection63 = collection63;
    }

    @Override
    public Object first() {
        if(!isDone()) {
            index = 0;
            return collection63.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
//        if(!isDone()) {
//            ++index;
            return collection63.getItem(++index);
//        }
//        return null;
    }

    @Override
    public Object current() {
        if(index >= 0)
            return collection63.getItem(index);
        return null;
    }

    @Override
    public boolean isDone() {
        return index == collection63.count() - 1;
    }
}
