package org.mpei.HomeWork_8.Auction;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReceiveZeroBehaviour extends Behaviour {
    List<ACLMessage> mikha = new ArrayList<>();
    @Override
    public void action() {
        ACLMessage receive = getAgent().receive();
        if (receive!= null) {
            System.out.println(getAgent().getLocalName() + " received:" + receive.getContent());
            mikha.add(receive);

            if (mikha.size() == 3) {
                ACLMessage pupus = mikha.stream()
                        .max(new Comparator<ACLMessage>() {
                            @Override
                            public int compare(ACLMessage o1, ACLMessage o2) {
                                return Integer.parseInt(o1.getContent()) > Integer.parseInt(o2.getContent()) ? 1 : -1;
                            }
                        }).get();
                System.out.println(pupus.getContent());
                System.out.println(pupus.getSender().getLocalName());

                ACLMessage message = new ACLMessage(ACLMessage.INFORM);
                message.setContent("Лот продан за " + pupus.getContent() + ". Вы" + " победили!");
                message.addReceiver(new AID(pupus.getSender().getLocalName(), false));
                getAgent().send(message);
            }
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return false;
    }

}
