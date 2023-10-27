package org.mpei.ClassWork_13;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

import static org.reflections.Reflections.log;

public class ReceiveMSGBehaviour extends Behaviour {
    private int count = 0;
    @Override
    public void action() {
        ACLMessage receive = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.INFORM));
        if (receive != null) {
            log.info("I receive msg: {} from {}", receive.getContent(), receive.getSender().getLocalName());
            count++;
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return count == 5;
    }
}
