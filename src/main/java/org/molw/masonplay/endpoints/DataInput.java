package org.molw.masonplay.endpoints;


import org.molw.masonplay.management.SimManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DataInput {
    @Autowired
    SimManager simManager;


    @GetMapping("/")
    public String rootUrl(){
        return "worked";
    }

    @GetMapping("/run")
    public String runSimulation(){
        return "worked";
    }

}
