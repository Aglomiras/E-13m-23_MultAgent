package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.OneShotBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Success extends OneShotBehaviour {
    /**
     * Данный класс используется, когда контракт с победителем будет заключен
     */
    @Override
    public void action() {
        log.info("Успех аукциона! " + myAgent.getLocalName()); //Лог об успешном завершении аукциона
    }
}
