package org.mpei.HomeWork_8.Auction;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

import java.util.Random;

public class ReceiveAuctionBehaviour extends Behaviour {
    @Override
    public void action() {
        ACLMessage receive = getAgent().receive();
        if (receive!= null) {
            System.out.println(getAgent().getLocalName() + " received:" + receive.getContent());

            int price = Integer.parseInt(receive.getContent());
            String priceAgent = parse(price);

            ACLMessage message = new ACLMessage(ACLMessage.INFORM);
            message.setContent(priceAgent);
            message.addReceiver(new AID("A0", false));
            getAgent().send(message);

        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return false;
    }

    public String parse(int price) {
        Random rand = new Random();
        price = rand.nextInt(price, price * 3);
        String stringPrice = String.valueOf(price);

        return stringPrice;
    }
}
