package org.molw.masonapp2;

import org.molw.masonplay.animals.Animal2;
import sim.engine.SimState;

public class MyApp2DoLoop {

    public static void main(String[] args) {
        String[]  myArgs = new String[]{"-for", "4"};
        SimState.doLoop(MySimState2.class, myArgs);
        System.exit(0);
    }

}
