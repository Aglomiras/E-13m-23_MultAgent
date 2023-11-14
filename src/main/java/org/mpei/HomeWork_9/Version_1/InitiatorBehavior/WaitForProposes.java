package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitForProposes extends ParallelBehaviour {
    /**
     * Поведение агента-инициатора, ожидающее получение сообщения от агентов об участии в аукционе.
     * Поведение является параллельным.
     * Если сообщения от агентов-участников не приходит в течение 5 секунд, то поведение заканчивается.
     * Если пришло хотя бы одно сообщение, то определяютя следующие действия агента-инициатора.
     */
    private int participantsCount; //Количество агентов-участников
    private Behaviour wakeupBeh; //Под-поведение WakerBehaviour
    private ReceiveProposesSubBehInit receiveBeh; //Под-поведение Behaviour

    public WaitForProposes(int participantsCount) {
        super(WHEN_ANY);
        this.participantsCount = participantsCount;
    }

    @Override
    public void onStart() {
        receiveBeh = new ReceiveProposesSubBehInit(participantsCount);
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
        if (wakeupBeh.done()) { //Проверка, закончилось ли поведение WakerBehaviour
            if (receiveBeh.onEnd() == 0) { //Если сообщений от агентов-участников нет по истечению времени, то выведет соответствующее сообщение
                log.info("Сообщений от участников не пришло! " + myAgent.getLocalName());
                return 0;
            } else {
                log.info("Ответил как минимум один участник! " + myAgent.getLocalName());
                //Если есть победитель аукциона, то отправляет ему сообщение о победе, а также всем остальным агентам сообщение о проигрыше через метод SendContract
                myAgent.addBehaviour(new SendContract(receiveBeh.getWinAgent(), receiveBeh.getLoseAgent()));
                return 1;
            }
        } else {
            if (receiveBeh.getBestOffer() != null) { //Проверка, есть ли сообщение от победителя
                log.info("Отправка ответа участникам! " + myAgent.getLocalName());
                //Если есть победитель аукциона, то отправляет ему сообщение о победе, а также всем остальным агентам сообщение о проигрыше через метод SendContract
                myAgent.addBehaviour(new SendContract(receiveBeh.getWinAgent(), receiveBeh.getLoseAgent()));
                return 1;
            } else {
                log.info("Сообщений от участников не пришло! " + myAgent.getLocalName()); //Лог о том, что никто из агентов-участников не согласился принять участие в аукционе
                return 0;
            }
        }
    }
}
