package org.molw.masonapp2;

import org.molw.masonapp1.MySimState;

/* This demo will have the 2 agents on a 10x10 grid and at the end of every step print out the
agents hash and their location
 */

public class MyApp2 {

    public static void main(String[] args) {
        System.out.println("About to run MyApp2");
        // Instantiate the SimState
        MySimState2 mySimState2 = new MySimState2(System.currentTimeMillis());

        //Tell it to start, which initializes and adds all the agents
        mySimState2.start();

        // Steps is how many steps we want the simulation to take.
        long steps = 0;
        while (steps < 4) {
            // if the sim state says it has no more steps to take then break
            // This should only happen if for some reason, the simulation ends before
            // it completes the desired number of steps
            if (!mySimState2.schedule.step(mySimState2))
                break;


            // Set the steps variable = the number of steps run by the simulation
            steps = mySimState2.schedule.getSteps();
        }

        // Tell the SimState to end and delete itself
        mySimState2.finish();

        System.out.println("done");

        // Make extra sure there are no threads left around
        System.exit(0);


    }

}
