package org.mpei.ClassWork_18;

public interface DataExchanger {
    boolean send(Order o);

    Order receive();
}
