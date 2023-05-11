package org.molw.masonapp1;

public class MyApp {

    public static void main(String[] args) {

        // Instantiate the SimState
         MySimState mySimState = new MySimState(System.currentTimeMillis());

        //Tell it to start, which initializes and adds all the agents
        mySimState.start();

        // Steps is how many steps we want the simulation to take.
        long steps = 0;
        while (steps < 2) {
            // if the sim state says it has no more steps to take then break
            // This should only happen if for some reason, the simulation ends before
            // it completes the desired number of steps
            if (!mySimState.schedule.step(mySimState))
                break;

            // Set the steps variable = the number of steps run by the simulation
            steps = mySimState.schedule.getSteps();
        }

        // Tell the SimState to end and delete itself
        mySimState.finish();

        System.out.println("done");

        // Make extra sure there are no threads left around
        System.exit(0);


    }

}
