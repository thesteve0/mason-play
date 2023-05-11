package org.molw.masonapp2;

import org.molw.masonplay.animals.Animal;
import org.molw.masonplay.animals.Animal2;
import sim.engine.SimState;
import sim.field.continuous.Continuous2D;
import sim.util.Double2D;

public class MySimState2 extends SimState {

    public MySimState2(long seed) {
        super(seed);
    }

    /*
    There is no need to make a different class for the worlds unless it gets really complicated
    In general you work with one of the grid or continuous space classes that ship by default.
    They are nothing more than either an Array or a HashMap that can keep track of values at the
    location and agents at the location.
     */

    public Continuous2D world = new Continuous2D(1.0,100, 100);

    public void start(){
        super.start();

        //make sure the world is empty
        world.clear();

        Animal2 a;
        for (int numberOfAnimals = 0; numberOfAnimals < 4 ; numberOfAnimals++) {

            //Make an animal
            a = new Animal2();

            //now place it in a random location on the grid
            world.setObjectLocation(a, new Double2D(random.nextDouble()*world.getWidth(), random.nextDouble()* world.getHeight()));

            //Add it to the scheduling queue
            schedule.scheduleRepeating(a);


        }
    }
}
