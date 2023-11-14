package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class StartAction extends OneShotBehaviour {
    /**
     * Поведение агента-инициатора для отправки участника сообщения с предложением
     * об участии в аукционе.
     * <p>
     * ACLMessage.FAILURE - тип отправляемого сообщения
     */
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.FAILURE);
        message.setContent("Auction");
        message.addReceiver(new AID("PartAgent1", false)); //Добавление адресата
        message.addReceiver(new AID("PartAgent2", false));
        message.addReceiver(new AID("PartAgent3", false));
        myAgent.send(message);
    }
}
