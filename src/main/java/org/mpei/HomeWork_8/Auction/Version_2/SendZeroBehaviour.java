package org.mpei.HomeWork_8.Auction.Version_2;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.Random;

public class SendZeroBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);

        Random rand = new Random();
        int price = rand.nextInt(1000);

        message.setContent(String.valueOf(price));
        message.addReceiver(new AID("A1", false));
        message.addReceiver(new AID("A2", false));
        message.addReceiver(new AID("A3", false));
        getAgent().send(message);
    }
}
