package org.mpei.ClassWork_11;

import jade.core.BehaviourID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ReceiveMsgBehaviour extends Behaviour {
    private boolean msgReceived;
    @Override
    public void onStart(){
        System.out.println("I'm wtf");
    }
    @Override
    public void action() {
        //TODO: implement real msg
        ACLMessage receive = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.CFP));
        if (receive != null) {
            System.out.println(myAgent.getLocalName()+ " - i recived MSG " + receive.getContent());
//            msgReceived = true;
        } else {
            block();
        }
    }


    @Override
    public boolean done() {
        return msgReceived;
    }
}
