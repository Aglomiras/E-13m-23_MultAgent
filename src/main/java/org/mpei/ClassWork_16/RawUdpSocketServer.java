package org.mpei.ClassWork_16;

import com.sun.jna.NativeLibrary;
import lombok.SneakyThrows;
import org.pcap4j.core.*;

import java.util.List;

public class RawUdpSocketServer {
    static {
        //install wireshark and check npcap was installed
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            NativeLibrary.addSearchPath("wpcap", "C:\\Windows\\System32\\Npcap");
        }
    }

    @SneakyThrows
    public void start(int port){
        List<PcapNetworkInterface> allDevs = Pcaps.findAllDevs();
        PcapNetworkInterface networkInterface = null;
        for (PcapNetworkInterface allDev : allDevs) {
            if (allDev.getName().equals("\\Device\\NPF_Loopback")){
                networkInterface = allDev;
                break;
            }
        }
        //TODO: handle if interface was not found
        PcapHandle pcapHandle = networkInterface.openLive(65536, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, 50);
        pcapHandle.setFilter("ip proto \\udp && dst port "+port, BpfProgram.BpfCompileMode.NONOPTIMIZE);

        new Thread( ()-> {
            try {
                pcapHandle.loop(0, (PacketListener) packet -> {
                    byte[] rawData = packet.getRawData();
                    byte[] data = new byte[rawData.length-32];
                    System.arraycopy(rawData, 32, data, 0, data.length);
                    System.out.println(new String(data));
                });
            } catch (PcapNativeException | InterruptedException | NotOpenException e) {
                throw new RuntimeException(e);
            }
        }).start();


    }
}
