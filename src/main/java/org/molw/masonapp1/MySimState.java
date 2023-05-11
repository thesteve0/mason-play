package org.molw.masonapp1;

import org.molw.masonplay.animals.Animal;
import sim.engine.SimState;

public class MySimState extends SimState {

    public MySimState(long seed) {
        super(seed);
    }


    /*
       This is where we set how many agents are in the simulation.
       We create them and then add them onto the schedule

       If we added a world then we would set it's size, initialize its cells, and I am not
       sure yet if you can schedule something to happen in each of the cells w/out there being an agent there
    */
    public void start(){
        super.start();
        Animal a;
        for (int numberOfAnimals = 0; numberOfAnimals < 2 ; numberOfAnimals++) {
            schedule.scheduleRepeating(new Animal());
        }
    }

}
