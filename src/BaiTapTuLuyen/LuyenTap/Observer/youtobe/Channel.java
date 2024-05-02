package BaiTapTuLuyen.LuyenTap.Observer.youtobe;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Subscriber> subs = new ArrayList<>();
    private String title;

    public void subcribe(Subscriber sub) {
        subs.add(sub);
    }

    public void unsubcribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubscribers() {
        for (var sub: subs) {
            sub.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
