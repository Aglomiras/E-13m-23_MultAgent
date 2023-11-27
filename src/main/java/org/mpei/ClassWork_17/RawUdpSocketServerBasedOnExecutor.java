package org.mpei.ClassWork_17;

import org.mpei.ClassWork_16.RawUdpSocketServer;
import org.pcap4j.core.PcapHandle;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RawUdpSocketServerBasedOnExecutor extends RawUdpSocketServer {
    private ScheduledExecutorService es;

    public RawUdpSocketServerBasedOnExecutor(ScheduledExecutorService es) {
        this.es = es;
    }

    @Override
    protected void runInThread(PcapHandle pcapHandle) {
        es.schedule(() -> this.grabPackets(pcapHandle), 0, TimeUnit.MILLISECONDS);
    }

    public void stopServer() {
        this.run = false;
    }
}
