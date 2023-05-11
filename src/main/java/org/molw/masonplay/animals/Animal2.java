package org.molw.masonplay.animals;

import sim.engine.SimState;
import sim.engine.Steppable;

public class Animal2 implements Steppable {


    @Override
    public void step(SimState simState) {
        //get the location for the animal and add it to the output
        //TODO I am stuck here. Do I ask the simstate to give me the world which then tells me my location
        //Or does this logic live out in the main class driving the simstate.
        System.out.println("I am an agent:" + hashCode());
    }
}
