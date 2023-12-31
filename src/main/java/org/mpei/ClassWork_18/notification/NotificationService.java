package org.mpei.ClassWork_18.notification;

import org.mpei.ClassWork_18.Order;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notyfier> noties = new ArrayList<>();

    public void perform(Order o, NotyType type) {
        noties.stream()
                .filter(e -> e.getType() == type)
                .findAny()
                .orElseThrow(() -> new RuntimeException(" such type is not found"))
                .send(o);
    }
}
