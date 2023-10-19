package org.mpei.ClassWork_11;

import jade.core.Agent;

public class Spammer extends Agent {
    @Override
    protected void setup() {
        this.addBehaviour(
                new DelayedMsgBehaviour(this, 5000));
    }
}
