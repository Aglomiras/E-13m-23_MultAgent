package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.OneShotBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Success extends OneShotBehaviour {
    /**
     * Класс используется, когда агент успешно совершил сделку
     */
    @Override
    public void action() {
        log.info("Я совершил сделку! " + myAgent.getLocalName()); //Лог о том, что агент смог совершить сделку
    }
}
