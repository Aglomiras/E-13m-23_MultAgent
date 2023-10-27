package org.mpei.ClassWork_13.FmsSubBehs;

import jade.core.behaviours.OneShotBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodEnd extends OneShotBehaviour {
    @Override
    public void action() {
        log.info("GOOD END");
    }
}
