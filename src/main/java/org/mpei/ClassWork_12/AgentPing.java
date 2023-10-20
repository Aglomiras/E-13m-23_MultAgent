package org.mpei.ClassWork_12;

import jade.core.Agent;

public class AgentPing extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agent " + this.getName() + " was born");

        AgentService.registrAgent(this, "PingerType");

        this.addBehaviour(new ReceiverPongBehaviour());
        this.addBehaviour(new SendPingBehaviour());
    }
}
