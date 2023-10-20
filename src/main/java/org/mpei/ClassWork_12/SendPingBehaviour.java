package org.mpei.ClassWork_12;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

public class SendPingBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.setContent("PING");
//        message.addReceiver(new AID("Ponger", false));
        List<AID> agents = AgentService.findAgents(myAgent, "PongerType");
        agents.forEach(ag -> message.addReceiver(ag));

        myAgent.send(message);
    }
}
