package HocOnline.TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> { // Khai quat hoa <MySinhVien la kieu du lieu>
    List<T> list = new ArrayList<>();
    public abstract int getId(T t); // tao phuong thuc truu tuong de lay id


    T findByID(int id) {
        for(var t: list) {
            if (getId(t) == id) return t;
        }
        return null;
    }

    public void add(T t) {
        for(var o: list) {
            if(getId(o) == getId(t)) return;
        }
        list.add(t);
    }

    public void update(T t) {
        for(int i = 0; i < list.size(); i++) {
            if(getId(list.get(i)) == getId(t)) {
                list.set(i, t);
                return;
            }
        }
    }

    public void deletebyID(int id) {
        for(var t: list) {
            if(getId(t) == id) {
                list.remove(t);
                return;
            }
        }
    }



}
