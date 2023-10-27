package org.mpei.HomeWork_8.PingPongRepit;

import jade.core.Agent;

public class AgentPing extends Agent {
    @Override
    protected void setup() {
        System.out.println(getLocalName() + " born");
        this.addBehaviour(new ReceivePingBehaviour());
        this.addBehaviour(new SendPingBehaviour()); //Начинает цикл передачи сообщений
    }
}
