package org.mpei.ClassWork_12;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class ReceiverPongBehaviour extends Behaviour {
    @Override
    public void action() {
        ACLMessage receivedMessage = myAgent.receive();
        if (receivedMessage != null) {
            System.out.println(myAgent.getLocalName() + " I recievedMessage " + receivedMessage.getContent() + " from " + receivedMessage.getSender().getName());

            myAgent.addBehaviour(new SendPingBehaviour());
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}
