package org.mpei.HomeWork_8.Auction.Version_1;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

import java.util.regex.Pattern;

public class ReceiveAuctionOtvetBehaviour extends Behaviour {
    @Override
    public void action() {
        ACLMessage receive = getAgent().receive();

        if (receive!= null) {
            if (Pattern.matches("[0-9]+", receive.getContent())) {
                block();
            } else {
                System.out.println(getAgent().getLocalName() + " received:" + receive.getContent());
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
