package org.mpei.ClassWork_12;

import jade.core.Agent;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AgentPing extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agent " + this.getName() + " was born");

        AgentService.registrAgent(this, "PingerType");

        this.addBehaviour(new ReceiverPongBehaviour());
        this.addBehaviour(new SendPingBehaviour());

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO, "Agent " + this.getName() + " was born");
    }
}
