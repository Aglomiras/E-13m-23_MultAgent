package org.mpei.HomeWork_8.PingPongRepit;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class ReceivePongBehaviour extends Behaviour {
    @Override
    public void action() {
        ACLMessage receive = getAgent().receive();
        if (receive != null) {
            System.out.println(getAgent().getLocalName() + " received:" + receive.getContent());
            getAgent().addBehaviour(new SendPongBehaviour());
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}
