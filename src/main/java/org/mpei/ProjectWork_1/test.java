package org.mpei.ProjectWork_1;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "Dpiego, where is my money? Dipego,you made me very upset";
        int value = str.indexOf("Diego");
        System.out.println(value);
    }

    //    [2, 0, 0, 0, 69, 0, 0, (byte)35, (byte)117, 57, (byte)159, 0, 0, 80, 11, 0, 0, 3, 2, 72, 10, 3, 2, 72, -12, 85, 4, -80, 0, 16, 121, 9, 104, 101, 108, 108, 111, 32, 49, 55]
//hello 17
//    {2, 0, 0, 0, 69, 0, 0, 36, 117, 91, 0, 0, -128, 17, 0, 0, 10, 3, 2, 72, 10, 3, 2, 72, -12, 85, 4, -80, 0, 16, 121, 9, 104, 101, 108, 108, 111, 32, 49, 55}
    //[2, 0, 0, 0, 69, 0, 0, 36, 117, 91, 0, 0, -128, 17, 0, 0, 10, 3, 2, 72, 10, 3, 2, 72, -12, 85, 4, -80, 0, 16, 121, 9]

    public byte[] creator(String data) {
        byte[] dataCreat = new byte[500];
        byte[] dataUdp = new byte[]{2, 0, 0, 0, 69, 0, 0, 36, 117, 91, 0, 0, -128, 17, 0, 0, 10, 3, 2, 72, 10, 3, 2, 72, -12, 85, 4, -80, 0, 16, 121, 9};
        byte[] strData = data.getBytes();

        return dataUdp;
    }

    public byte[] create(String data) {
        int len = data.getBytes().length + 20 + 8;
        byte len1 = (byte) (len >> 8 & 255);
        byte len2 = (byte) (len & 255);

        List<Byte> bytes = new ArrayList<>();
        byte[] start = {2, 0, 0, 0, 69, 0, len1, len2, (byte) 195, (byte) 164, 0, 0, (byte) 128, 17, 0, 0,
                (byte) 172, (byte) 20, (byte) 10, (byte) 9,
                (byte) 172, (byte) 20, (byte) 10, (byte) 9};
        for (byte b : start) {
            bytes.add(b);
        }
        System.out.println("bytes: " + bytes);

        List<Byte> UDPbytes = new ArrayList<>();
        int dPort = 56878;
        byte dPortb1 = (byte) (dPort >> 8 & 255);
        bytes.add(dPortb1);


        byte dPortb2 = (byte) (dPort & 255);
        bytes.add(dPortb2);
        System.out.println("dPortb2: " + dPortb2);

        System.out.println("dPortb1: " + dPort + " " + (((dPortb1 & 0xFF) << 8) + (dPortb2 & 0xFF)));

        int sPort = 1200;
        byte sPortb1 = (byte) (sPort >> 8 & 255);
        bytes.add(sPortb1);
        int val = ((sPortb1 & 0xFF));
        System.out.println("sPortb1: " + val);

        byte sPortb2 = (byte) (sPort & 255);
        bytes.add(sPortb2);
        System.out.println("sPortb2:" + sPortb2);

        int length = data.getBytes().length + 8;
        System.out.println("length: " + length);

        byte length1 = (byte) (length >> 8 & 255);
        bytes.add(length1);
        System.out.println("length1: " + length1);

        byte length2 = (byte) (length & 255);
        bytes.add(length2);
        System.out.println("length2: " + length2);

        bytes.add((byte) 0);
        bytes.add((byte) 0);

        System.out.println("bytes: " + bytes);

        for (byte aByte : data.getBytes()) {
            bytes.add(aByte);
        }
        System.out.println("bytes: " + bytes);

        byte[] massByte = new byte[bytes.size()];
        int i = 0;
        for (Byte aByte : bytes) {
            massByte[i] = aByte;
            i++;
        }
        System.out.println("massByte: " + massByte);

        return massByte;
    }

/**
 * Поток для паблишеда*/
    //    @Override
//    public void startPublishing(AID aid, int port) {

//        if (agent.isAlive()) {
//            System.out.println("77777");
//            DtoAidAgent dtoAidAgent = new DtoAidAgent(aid.getLocalName(), false);
//            String strDto = JsonUtils.code(dtoAidAgent);
//
//            PacketCreator packetCreator = new PacketCreator();
//            byte[] data = packetCreator.collectPacket(strDto, port);
//            this.rawUdpSocketClient.send(data);
//        } else {
//            this.rawUdpSocketServer.setFlagLiveAgent(false);
//            log.info("Сервер упал: " + agent.getLocalName());
//        }
//    }
//
//    @Override
//    public void startDiscovering(int port) {
//        this.rawUdpSocketServer.start(this.port);
//    }
//
//    @Override
//    public List<AID> getActiveAgents() {
//
//
//        return null;
//    }
//
//    public void checkLiveAgent() {
//        System.out.println("09090");
//    }


    //        new Thread(() -> {
//            boolean isGuid = false;
//            if (aid.getLocalName().equals(aid.getName())) {
//                isGuid = true;
//            }
//            DtoAidAgent a = new DtoAidAgent(aid.getLocalName(), isGuid);
//            Gson gson = new Gson();
//            String json = gson.toJson(a);
//
//            byte[] data = new byte[0];
//            data = packetCreator.create(json);
//            while (true) {
//                try {
//                    RawUdpSocketClient client = new RawUdpSocketClient();
//                    client.initialize(port);
//                    client.send(data);
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
}
