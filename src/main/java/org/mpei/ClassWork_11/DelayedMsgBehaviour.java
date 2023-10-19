package org.mpei.ClassWork_11;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.Date;

public class DelayedMsgBehaviour extends WakerBehaviour {
    public DelayedMsgBehaviour(Agent a, long wakeupTime) {
        super(a, wakeupTime);
    }

    @Override
    protected void onWake() {
        ACLMessage m = new ACLMessage(ACLMessage.CFP);
        m.setContent("Hello");
        m.addReceiver(new AID("Stepan", false));
        myAgent.send(m);
    }
}
