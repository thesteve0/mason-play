package org.molw.masonapp2;

import org.molw.masonplay.animals.Animal2;
import sim.engine.SimState;

public class MyApp2DoLoop {

    public static void main(String[] args) {

        String[]  myArgs = new String[]{"-for", "4"};

        //This runs the simulation 4 times. Probably the preferable way to do it as long as I don't need some sort of custom
        //way of scheduling
        SimState.doLoop(MySimState2.class, myArgs);
        System.exit(0);
    }

}
