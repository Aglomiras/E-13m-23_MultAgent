package org.mpei.ClassWork_11;

import jade.core.Agent;

public class MyAgent extends Agent {
    @Override
    protected void setup() {
//        this.addBehaviour(new HellowBehaviour());
//        this.addBehaviour(new SarchBehaviour(this, 5000));
        this.addBehaviour(new ReceiveMsgBehaviour());
    }
}
