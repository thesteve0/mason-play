package org.molw.masonplay.animals;

import sim.engine.SimState;
import sim.engine.Steppable;

public class Animal implements Steppable {


    @Override
    public void step(SimState simState) {
        System.out.println("I am an agent:" + hashCode());
    }
}
