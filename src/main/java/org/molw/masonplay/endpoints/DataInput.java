package org.molw.masonplay.endpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataInput {

    @GetMapping("/")
    public String rootUrl(){
        return "worked";
    }

    @GetMapping("/run")
    public String runSimulation(){
        return "worked";
    }

}
