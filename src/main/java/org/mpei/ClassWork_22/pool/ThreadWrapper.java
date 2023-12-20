package org.mpei.ClassWork_22.pool;

import lombok.Getter;
import lombok.Setter;

public class ThreadWrapper extends Thread {
    @Getter
    @Setter
    private boolean used = false;
}
