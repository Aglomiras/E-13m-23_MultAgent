package org.mpei.ClassWork_20.Primer;

import jade.core.Agent;

public class AgentBuyer extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new StartAuction(this, 3000));


    }
}
