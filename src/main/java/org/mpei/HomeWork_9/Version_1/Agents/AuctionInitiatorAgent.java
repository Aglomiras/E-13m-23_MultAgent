package org.mpei.HomeWork_9.Version_1.Agents;

import jade.core.Agent;
import lombok.extern.slf4j.Slf4j;
import org.mpei.HomeWork_9.Version_1.InitiatorBehavior.FSMBehaviourInitiatorAgent;

@Slf4j
public class AuctionInitiatorAgent extends Agent {
    @Override
    protected void setup() {
        /**
         * Класс агента-инициатора, который запустит аукцион
         * */
        log.info("I was born {}", this.getLocalName()); //Лог о создании агента-инициатора
        this.addBehaviour(new FSMBehaviourInitiatorAgent()); //Добавление FSM-поведения
    }
}
