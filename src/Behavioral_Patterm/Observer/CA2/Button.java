package Behavioral_Patterm.Observer.CA2;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<OnClickListener> listeners = new ArrayList<>();

    public void attach(OnClickListener listener) {
        listeners.add(listener);
    }

    public void detach(OnClickListener listener) {
        listeners.remove(listener);
    }


    public void onClick() {
        for(var c: listeners) {
            c.onClick();
        }
    }


}
