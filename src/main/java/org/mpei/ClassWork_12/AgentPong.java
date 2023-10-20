package org.mpei.ClassWork_12;

import jade.core.Agent;

public class AgentPong extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agent " + this.getName() + " was born");

        AgentService.registrAgent(this, "PongerType");

        this.addBehaviour(new ReceiverPingBehaviour());
        this.addBehaviour(new SendPongBehaviour());
    }
}
