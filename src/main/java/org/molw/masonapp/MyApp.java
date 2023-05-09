package org.molw.masonapp;

import org.molw.masonplay.animals.Animal;
import sim.engine.SimState;

public class MyApp extends SimState {

    public MyApp(long seed) {
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

    public static void main(String[] args) {

        // Instantiate the SimState
        MyApp myApp = new MyApp(System.currentTimeMillis());

        //Tell it to start, which initializes and adds all the agents
        myApp.start();

        // Steps is how many steps we want the simulation to take.
        long steps = 0;
        while (steps < 2) {
            // if the sim state says it has no more steps to take then break
            // This should only happen if for some reason, the simulation ends before
            // it completes the desired number of steps
            if (!myApp.schedule.step(myApp))
                break;

            // Set the steps variable = the number of steps run by the simulation
            steps = myApp.schedule.getSteps();
        }

        // Tell the SimState to end and delete itself
        myApp.finish();

        // Make extra sure there are no threads left around
        System.exit(0);

        System.out.println("Done");
    }

}
