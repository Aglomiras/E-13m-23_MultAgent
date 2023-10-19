package org.mpei.ClassWork_11;

import jade.core.behaviours.OneShotBehaviour;

public class HellowBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("Hello all, I'm " + this.myAgent.getLocalName());
    }
}
