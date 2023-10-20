package org.mpei.ClassWork_12;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.List;

public class SendPongBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.setContent("PONG");
//        message.addReceiver(new AID("Pinger", false));
        List<AID> agents = AgentService.findAgents(myAgent, "PingerType");
        agents.forEach(ag -> message.addReceiver(ag));

        myAgent.send(message);
    }
}
