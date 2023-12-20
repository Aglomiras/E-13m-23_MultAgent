package org.mpei.ClassWork_22;

public class SocketBuilder {
    private Socket s;
    public SocketBuilder build(SocketType t) {
        switch (t) {
            case TCP -> s = new TcpSocket();
            case UDP -> s = new UdpSocket();
        }
        return this;
    }
    public SocketBuilder setIp(String ip) {
        s.setAddress(ip);
        return this;
    }

    public SocketBuilder setPort(int port) {
        s.setPort(port);
        return this;
    }

//    public Socket build() {
//
//    }
}
