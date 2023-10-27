package org.mpei.HomeWork_8.PingPongRepit;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class SendPingBehaviour extends OneShotBehaviour {
    /**
     * Создает, заполняет и отправляет сообщение агенту.
     * */
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM); //Создаем сообщение, которое будем отправлять другому агенту (оно пока пустое)
        message.setContent("Ping"); //Заполняем содержимым созданное сообщение
        message.addReceiver(new AID("Pongs", false)); //Указываем адрессата (именно имя агента), кому будет отправлено письмо
        getAgent().send(message);
    }
}
