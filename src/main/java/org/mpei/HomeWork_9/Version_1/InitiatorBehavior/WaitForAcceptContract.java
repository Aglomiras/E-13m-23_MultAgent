package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitForAcceptContract extends ParallelBehaviour {
    /**
     * Поведение агента-инициатора, ожидающее сообщение от агента-участника о заключении/не заключении контракта.
     * Ждет сообщение с ответом будет ли заключен контракт. ЕСли сообщение не пришло,
     * значит победитель проигнорировал контракт и тогда, поведение закончится
     * по истечению времени (5 секунд)
     */
    private Behaviour wakeupBeh; //Под-поведение WakerBehaviour
    private ReceiveAcceptSubBehInt receiveBeh; //Под-поведение Behaviour

    public WaitForAcceptContract() {
        super(WHEN_ANY);
    }

    @Override
    public void onStart() {
        receiveBeh = new ReceiveAcceptSubBehInt();
        wakeupBeh = new WakerBehaviour(myAgent, 5000) {
            boolean wake = false;

            @Override
            protected void onWake() {
                wake = true;
                log.info("TIME IS UP");
            }

            @Override
            public int onEnd() {
                return wake ? 0 : 1;
            }
        };

        this.addSubBehaviour(receiveBeh);
        this.addSubBehaviour(wakeupBeh);
    }

    @Override
    public int onEnd() {
        if (wakeupBeh.done()) { //True - если по истечению времени победитель не ответил
            if (receiveBeh.onEnd() == 0) {
                log.info("Никто не ответил... " + myAgent.getLocalName()); //Лог о том, что победитель не ответил
                return 0;
            } else {
                return 1;
            }
        } else {
            if (receiveBeh.onEnd() == 1) { //Если победитель ответил, то это выражение true
                log.info("Контракт с победителем заключен! " + myAgent.getLocalName()); //Лог о заключении контракта
                return 1;
            } else {
                log.info("Победитель не захотел заключать контракт... " + myAgent.getLocalName()); //Лог об отказе заключать контракт
                return 0;
            }
        }
    }
}
