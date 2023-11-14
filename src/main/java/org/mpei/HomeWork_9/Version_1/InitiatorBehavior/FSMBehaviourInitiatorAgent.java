package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.FSMBehaviour;

public class FSMBehaviourInitiatorAgent extends FSMBehaviour {
    /**
     * FSM-поведение для инициатора
     * */
    private final String FIRST_STATE = "firstState";
    private final String WAIT_PROPOSES = "waitProps";
    private final String WAIT_ACCEPT = "waitAccept";
    private final String SUCCESS = "success";
    private final String FAIL = "fail";

    @Override
    public void onStart() {
        this.registerFirstState(new StartAction(), FIRST_STATE);
        this.registerState(new WaitForProposes(3), WAIT_PROPOSES);
        this.registerState(new WaitForAcceptContract(), WAIT_ACCEPT);
        this.registerLastState(new Fail(), FAIL);
        this.registerLastState(new Success(), SUCCESS);

        this.registerDefaultTransition(FIRST_STATE, WAIT_PROPOSES); //Вызывается поведение FIRST_STATE, а потом WAIT_PROPOSES
        this.registerTransition(WAIT_PROPOSES, FAIL, 0); //Если WAIT_PROPOSES вернет 0, то вызовется FAIL
        this.registerTransition(WAIT_PROPOSES, WAIT_ACCEPT, 1); //Если WAIT_PROPOSES вернет 1, то вызовется WAIT_ACCEPT
        this.registerTransition(WAIT_ACCEPT, FAIL, 0); //Если WAIT_ACCEPT вернется 0, то вызовется FAIL
        this.registerTransition(WAIT_ACCEPT, SUCCESS, 1); //Если WAIT_ACCEPT вернется 1, то вызовется SUCCESS
    }
}
