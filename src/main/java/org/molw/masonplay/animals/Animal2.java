package org.molw.masonplay.animals;

import org.molw.masonapp2.MySimState2;
import sim.engine.SimState;
import sim.engine.Steppable;
import sim.util.Double2D;

public class Animal2 implements Steppable {


    @Override
    public void step(SimState simState) {
        //get the location for the animal and add it to the output
        //TODO I am stuck here. Do I ask the simstate to give me the world which then tells me my location
        //Or does this logic live out in the main class driving the simstate.

        // Here is a good example
        // https://github.com/thesteve0/mason/blob/master/mason/src/main/java/sim/app/antsforage/Ant.java

        MySimState2 ourSimState2 = (MySimState2) simState;
        Double2D loc = ourSimState2.world.getObjectLocationAsDouble2D(this);

        System.out.println("I am an agent:" + hashCode() + " and I am located at: " + loc.toCoordinates());
    }
}
