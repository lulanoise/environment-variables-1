package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    @Value("myCustomProps.devName")
    String devName;

    @Value("myCustomProps.authCode")
    String authCode;

    @GetMapping("")
    public String getProperties (){
        String prop1 = environment.getProperty("myCustomProps.devName");
        String prop2 = environment.getProperty("myCustomProps.authCode");
        return "Hello! " + prop1 + " " + prop2;
    }

}