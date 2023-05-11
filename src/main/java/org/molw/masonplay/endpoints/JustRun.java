package org.molw.masonplay.endpoints;

import org.molw.masonapp1.MySimState2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustRun {

    @GetMapping("/")
    public String rootUrl(){
        return "worked";
    }

    @GetMapping("/run")
    public String runSimulation(){
        /* this is ugly but we just want to see if we can call the web application and get it to
        run the simulation
         */

        // Instantiate the SimState
        MySimState2 mySimState = new MySimState2(System.currentTimeMillis());

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


        return("finsihed");
    }

}
