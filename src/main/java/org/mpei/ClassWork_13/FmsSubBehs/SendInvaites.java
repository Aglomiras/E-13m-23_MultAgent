package org.mpei.ClassWork_13.FmsSubBehs;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.List;

public class SendInvaites extends OneShotBehaviour {
    private List<String> agentName;
    public SendInvaites(List<String> agentName) {
        this.agentName = agentName;
    }
    @Override
    public void action() {
        ACLMessage m = new ACLMessage(ACLMessage.CFP);

        agentName.stream()
                .map(e -> new AID(e, false))
                .forEach(aid -> m.addReceiver(aid));

    }
}
