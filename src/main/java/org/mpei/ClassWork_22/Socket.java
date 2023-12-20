package org.mpei.ClassWork_22;

import lombok.Data;

import java.util.function.Consumer;

@Data
public abstract class Socket {
    private String address;
    private int port;
    private Consumer<String> consumer;
    public abstract boolean send(String data);
    public abstract void receive();
    public void addConsumer(Consumer<String> c) {
        this.consumer = c;
    }

}
