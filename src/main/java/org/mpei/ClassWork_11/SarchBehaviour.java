package org.mpei.ClassWork_11;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class SarchBehaviour extends TickerBehaviour {
    public SarchBehaviour(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        System.out.println("Where is all?");
    }
}
