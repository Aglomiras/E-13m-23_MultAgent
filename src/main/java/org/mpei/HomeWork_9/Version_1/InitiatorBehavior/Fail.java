package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.OneShotBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fail extends OneShotBehaviour {
    /**
     * Данный класс используется для оповещения о провале аукциона в тех случаях, когда:
     * - участники не приняли предложение об участии в аукционе;
     * - победитель не захотел заключать контракт
     * */
    @Override
    public void action() {
        log.info("Провал аукциона! " + myAgent.getLocalName()); //Лог о провале аукциона
    }
}
