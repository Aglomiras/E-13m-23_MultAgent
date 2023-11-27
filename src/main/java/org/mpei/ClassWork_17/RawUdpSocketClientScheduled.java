package org.mpei.ClassWork_17;

import lombok.SneakyThrows;
import org.mpei.ClassWork_16.RawUdpSocketClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class RawUdpSocketClientScheduled extends RawUdpSocketClient {
    private ExecutorService es;
    private ScheduledExecutorService ses;
    private ScheduledFuture<?> scheduledFuture;

//    public RawUdpSocketClientScheduled(ExecutorService es) {
//        this.es = es;
//    }

    public RawUdpSocketClientScheduled(ScheduledExecutorService ses) {
        this.ses = ses;
    }

    @SneakyThrows
    public void periodicSend(byte[] data, long period) {
//        es.submit(() -> {
//            while (true){
//                send(data);
//                Thread.sleep(period);
//            }
//        });
        scheduledFuture = ses.scheduleAtFixedRate(() -> send(data), 0, period, TimeUnit.MILLISECONDS);
    }

    public void stop() {
        scheduledFuture.cancel(false);
    }
}
