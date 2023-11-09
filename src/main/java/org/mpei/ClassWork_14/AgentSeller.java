package org.mpei.ClassWork_14;

import jade.core.Agent;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class AgentSeller extends Agent {

    @Override
    protected void setup() {
        DfHelper.register(this, "selling_books");
        double minPrice = new Random().nextDouble() * 10 + 10;
        log.info("My min price {}", minPrice);
        this.addBehaviour(new AuctionStartMsgCatcher(minPrice));
    }
}
