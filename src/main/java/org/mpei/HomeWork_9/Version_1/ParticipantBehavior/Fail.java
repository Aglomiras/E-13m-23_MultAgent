package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.OneShotBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fail extends OneShotBehaviour {
    /**
     * Класс используется, когда агент не смог совершить сделку:
     * - отказался от участия в аукционе;
     * - отказался от заключения контракта, после оповещения о победе;
     */
    @Override
    public void action() {
        log.info("Я зафейлил сделку... " + myAgent.getLocalName()); //Лог о том, что агент-участник не смог завершить сделку
    }
}
