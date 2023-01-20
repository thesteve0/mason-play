package org.molw.masonplay.management;

import ec.util.MersenneTwisterFast;
import org.molw.masonplay.animals.Animal;
import sim.engine.Schedule;
import sim.engine.SimState;

public class SimRunner extends SimState {
    public SimRunner(long seed) {
        super(seed);
    }

    protected SimRunner(MersenneTwisterFast random, Schedule schedule) {
        super(random, schedule);
    }

    protected SimRunner(long seed, Schedule schedule) {
        super(seed, schedule);
    }

    protected SimRunner(MersenneTwisterFast random) {
        super(random);
    }

    public void start(){
        super.start();
        for (int i = 0; i < 2; i++) {
            Animal animal = new Animal();
            schedule.scheduleRepeating(animal);

        }
    }

   public void  go(int numberOfSteps){
        String[] args = {"no args"};
        doLoop(SimRunner.class, args);

        /*
        doLoop never ends until interrupted. To do a predefined number of steps we need to
        make the loop logic ourself

        I think this code needs to go in an object that creates the SimRunner

        SimState state = new MyModel(System.currentTimeMillis()); // MyModel is our SimState subclass
for(int job = 0; job < jobs; job++)
{
state.setJob(job);
state.start();
do
if (!state.schedule.step(state)) break;
while(state.schedule.getSteps() < 5000);
state.finish();
}
System.exit(0)
         */
   }


}
