package org.mpei.ClassWork_22.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyThreadPool {
    private List<ThreadWrapper> pool;
    private final int maxSize;

    public MyThreadPool(int size) {
        this.maxSize = size;
        pool = new ArrayList<>();
    }

    public Thread get() {
        Optional<ThreadWrapper> any = pool.stream().filter(e -> !e.isUsed()).findAny();
        if (any.isPresent()) {
            return any.get();
        } else {
            if (pool.size() == maxSize) {
                throw new RuntimeException("No free threads are available");
            } else {
                ThreadWrapper threadWrapper = new ThreadWrapper();
                pool.add(threadWrapper);
                return threadWrapper;
            }
        }
    }

    public void release(ThreadWrapper tw) {
        tw.setUsed(false);
    }
}
