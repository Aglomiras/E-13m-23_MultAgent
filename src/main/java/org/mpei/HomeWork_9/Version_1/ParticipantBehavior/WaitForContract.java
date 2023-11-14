package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitForContract extends ParallelBehaviour {
    /**
     * Поведение агента-участника, запускаемое, после того, как агент-участник предложит агенту-инициатору
     * ставку >0.
     * Данное поведение является параллельным.
     * Если ответного сообщения от инициатора по истечении 5 секунд не пришло, то оно автоматически заканчивается.
     * Если сообщение от инициатора пришло, то оно будет поймано под-поведение ReceiveForSubBehInit
     * */
    private Behaviour wakeupBeh; //Под-поведение WakerBehaviour
    private ReceiveForSubBehInit receiveBeh; //Под-поведение Behaviour

    public WaitForContract() {
        super(WHEN_ANY);
    }

    @Override
    public void onStart() { //Метод, вызываемый при старте поведения
        receiveBeh = new ReceiveForSubBehInit();
        wakeupBeh = new WakerBehaviour(myAgent, 5000) { //Запуск под-поведения WakerBehaviour
            boolean wake = false;

            @Override
            protected void onWake() {
                wake = true;
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
        if (wakeupBeh.done()) { //Проверка закончилось ли поведение WakerBehaviour (если true - сообщений от агента-инициатора не приходило)
            if (receiveBeh.onEnd() == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (receiveBeh.onEnd() == 1) { //Проверка победил ли агент в аукционе
                log.info("I'm a winner " + myAgent.getLocalName()); //Лог о том, что агент-участник победитель
                return 1;
            } else {
                log.info("I'm a looser " + myAgent.getLocalName()); //Лог о том, что агент-участник проигравший
                return 0;
            }
        }
    }
}
