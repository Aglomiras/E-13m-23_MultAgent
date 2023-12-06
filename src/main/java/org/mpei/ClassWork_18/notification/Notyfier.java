package org.mpei.ClassWork_18.notification;

import io.vavr.collection.Tree;
import org.mpei.ClassWork_18.Order;

public interface Notyfier {
    void send(Order o);

    NotyType getType();
}
