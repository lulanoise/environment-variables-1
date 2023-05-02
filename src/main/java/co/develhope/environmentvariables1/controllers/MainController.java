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

    @Value("${myCustomProps.devName}")
    String devName;

    @Value("${myCustomProps.authCode}")
    String authCode;

    @GetMapping("")
    public String getProperties (){
        return "Hello! " + devName + " " + authCode;
    }

}