package org.mpei.HomeWork_8.PingPongRepit;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class SendPongBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM); //Создаем сообщение, которое будем отправлять другому агенту (оно пока пустое)
        message.setContent("Pong"); //Заполняем содержимым созданное сообщение
        message.addReceiver(new AID("Pings", false)); //Указываем адрессата, кому будет отправлено письмо
        getAgent().send(message);
    }
}
