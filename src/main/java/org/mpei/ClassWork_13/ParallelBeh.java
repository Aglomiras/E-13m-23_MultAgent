package org.mpei.ClassWork_13;

import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;

import static org.reflections.Reflections.log;

public class ParallelBeh extends ParallelBehaviour {
    private Behaviour reciveBeh, wakeBeh;
    public ParallelBeh() {
        super(WHEN_ANY);
    }

    @Override
    public void onStart() {
        reciveBeh= new ReceiveMSGBehaviour();
        this.addSubBehaviour(reciveBeh);
        wakeBeh = new TimeIsOverWakerBehaviour(myAgent, 15000);
        this.addSubBehaviour(wakeBeh);
    }

    @Override
    public int onEnd() {
        if (reciveBeh.done()) {
            log.info("Required msgs were received");
        } else {
            log.info("Time is up !!!!!");
        }
        return 0;
    }
}
