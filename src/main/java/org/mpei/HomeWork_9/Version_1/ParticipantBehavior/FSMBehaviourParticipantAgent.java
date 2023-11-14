package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.FSMBehaviour;

public class FSMBehaviourParticipantAgent extends FSMBehaviour {
    /**
     * FSM-поведение для участника
     */
    private final String WAIT_INVITE = "waitInvite";
    private final String SEND_ANSWER = "sendAnswer";
    private final String WAIT_CONTRACT = "waitContract";
    private final String SEND_CONTRACT = "sendContract";
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    @Override
    public void onStart() {
        this.registerFirstState(new WaitForInivite(), WAIT_INVITE);
        this.registerState(new SendAnswer(), SEND_ANSWER);
        this.registerState(new WaitForContract(), WAIT_CONTRACT);
        this.registerState(new SendContract(), SEND_CONTRACT);
        this.registerLastState(new Fail(), FAIL);
        this.registerLastState(new Success(), SUCCESS);

        this.registerDefaultTransition(WAIT_INVITE, SEND_ANSWER); //Вызывается поведение WAIT_INVITE, а по его окончанию SEND_ANSWER
        this.registerTransition(SEND_ANSWER, FAIL, 0); //Если SEND_ANSWER возвращает 0, то вызывается поведение FAIL
        this.registerTransition(SEND_ANSWER, WAIT_CONTRACT, 1); //Если SEND_ANSWER возвращает 1, то вызывается поведение WAIT_CONTRACT
        this.registerTransition(WAIT_CONTRACT, FAIL, 0); //Если WAIT_CONTRACT возвращает 0, то вызывается поведение FAIL
        this.registerTransition(WAIT_CONTRACT, SEND_CONTRACT, 1); //Если WAIT_CONTRACT возвращает 1, то вызывается поведение SEND_CONTRACT
        this.registerTransition(SEND_CONTRACT, FAIL, 0); //Если SEND_CONTRACT возвращает 0, то вызывается поведение FAIL
        this.registerTransition(SEND_CONTRACT, SUCCESS, 1); //Если SEND_CONTRACT возвращает 1, то вызывается поведение SUCCESS
    }
}
