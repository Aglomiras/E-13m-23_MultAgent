package org.mpei.HomeWork_8.PingPongRepit;

import jade.core.Agent;

public class AgentPong extends Agent {
    @Override
    protected void setup() {
        System.out.println(getLocalName() + " born");
        this.addBehaviour(new ReceivePongBehaviour()); //Этот агент только отвечает на сообщения
    }
}
