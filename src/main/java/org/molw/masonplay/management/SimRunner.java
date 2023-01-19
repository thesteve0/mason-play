package org.molw.masonplay.management;

import ec.util.MersenneTwisterFast;
import sim.engine.Schedule;
import sim.engine.SimState;

public class SimRunner extends SimState {
    public SimRunner(long seed) {
        super(seed);
    }

    protected SimRunner(MersenneTwisterFast random, Schedule schedule) {
        super(random, schedule);
    }

    protected SimRunner(long seed, Schedule schedule) {
        super(seed, schedule);
    }

    protected SimRunner(MersenneTwisterFast random) {
        super(random);
    }


}
