package org.mpei.ClassWork_17;

import org.mpei.ClassWork_16.RawUdpSocketServer;
import org.pcap4j.core.PcapHandle;

import java.util.concurrent.ExecutorService;

public class RawUdpSocketServerBaseOnExecutor extends RawUdpSocketServer {
    private ExecutorService es;

    public RawUdpSocketServerBaseOnExecutor(ExecutorService es) {
        this.es = es;
    }

    @Override
    protected void runInThread(PcapHandle pcapHandle) {
        es.execute(() -> this.grabMethod(pcapHandle));
    }
}
