package org.mpei.HomeWork_8.Auction.Version_1;

import jade.core.Agent;

public class AgentTwo extends Agent {
    @Override
    protected void setup() {
        System.out.println(getLocalName() + " born");
        this.addBehaviour(new ReceiveAuctionBehaviour());
        this.addBehaviour(new ReceiveAuctionOtvetBehaviour());
    }
}
