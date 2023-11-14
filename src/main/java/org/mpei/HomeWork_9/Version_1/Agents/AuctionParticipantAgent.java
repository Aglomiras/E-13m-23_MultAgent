package org.mpei.HomeWork_9.Version_1.Agents;

import jade.core.Agent;
import lombok.extern.slf4j.Slf4j;
import org.mpei.HomeWork_9.Version_1.ParticipantBehavior.FSMBehaviourParticipantAgent;

@Slf4j
public class AuctionParticipantAgent extends Agent {
    @Override
    protected void setup() {
        /**
         * Класс агентов-участников, которые участвуют в аукционе
         * */
        log.info("I was born {}", this.getLocalName()); //Лог о создании агента-участника
        this.addBehaviour(new FSMBehaviourParticipantAgent()); //Добавление FSM-поведения
    }
}
