package org.mpei.ClassWork_13.Auction;

import jade.core.behaviours.FSMBehaviour;
import org.mpei.ClassWork_13.FmsSubBehs.BadEnd;
import org.mpei.ClassWork_13.FmsSubBehs.GoodEnd;
import org.mpei.ClassWork_13.FmsSubBehs.SendInvaites;
import org.mpei.ClassWork_13.FmsSubBehs.WaitForAnswersParallelBehaviour;

import java.util.List;

public class MyAuctionConductionFSMBehaviour extends FSMBehaviour {
    private static final String FIRST_STATE="firstState", WAIT_PROPOSES="waitProps", GOOD_END="goodEnd", BAD_END="badEnd";
    @Override
    public void onStart() {
        //TODO: fill it with DF results

        List<String> receivers = List.of("Agent2");
        this.registerFirstState(new SendInvaites(receivers), FIRST_STATE);
        this.registerState(new WaitForAnswersParallelBehaviour(receivers.size()), WAIT_PROPOSES);
        this.registerLastState(new GoodEnd(),GOOD_END);
        this.registerLastState(new BadEnd(), BAD_END);

        this.registerDefaultTransition(FIRST_STATE, WAIT_PROPOSES);
        this.registerTransition(WAIT_PROPOSES, BAD_END, 1);
        this.registerTransition(WAIT_PROPOSES, GOOD_END, 2);
    }
}
