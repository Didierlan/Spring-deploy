package com.example.Springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    //@Value("${app.username}")
    //String username;

    @GetMapping("/holita")
    public String hello(){
        System.out.println(message);

        return "Hola mundo que tal, hasta luego chavalas!!";
    }

    @GetMapping("/")
    public String inicio(){
        return "HOLA estoy funcionando";
    }
}

