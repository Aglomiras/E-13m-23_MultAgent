package org.mpei.ClassWork_18.notification;

import io.vavr.collection.Tree;
import org.mpei.ClassWork_18.Order;

public class SmsNoty implements Notyfier {
    @Override
    public void send(Order o) {
        //TODO:
    }

    @Override
    public NotyType getType() {
        return NotyType.SMS;
    }
}
