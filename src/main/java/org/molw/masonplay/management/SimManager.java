package org.molw.masonplay.management;

import org.molw.masonplay.animals.Animal;
import org.springframework.stereotype.Component;

/**
 * This class manages starting, collecting, and shutting down the simulations. I think this will help in
 * the future for expansion
 *
 * TODO add the no parameters call to DataInput and then just make sure it works
 * then try to get the animal to step
 */
@Component
public class SimManager {

    public String startSimulation(){
        return "No parameters working";
    }

    public String startSimulation(int runs, Animal movingAnimal){
        return "worked";
    }
}


