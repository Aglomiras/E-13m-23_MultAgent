package org.mpei.HomeWork_8.Auction.Version_1;

import jade.core.Agent;

public class AgentZero extends Agent {
    @Override
    protected void setup() {
        System.out.println(getLocalName() + " born");
        this.addBehaviour(new SendZeroBehaviour());
        this.addBehaviour(new ReceiveZeroBehaviour());
    }
}
