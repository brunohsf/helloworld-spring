package com.helloworld.controller;

import com.helloworld.model.WelcomeModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public WelcomeModel welcome(@RequestParam(name = "name", defaultValue = "Fatec Jales") String name,
                                @RequestParam(name = "msg", defaultValue = "Welcome!!!") String msg
    ){
        return new WelcomeModel(1, name, msg);

    }

}
