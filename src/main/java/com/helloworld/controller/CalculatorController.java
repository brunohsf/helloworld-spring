package com.helloworld.controller;


import com.helloworld.model.CalculatorModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/sum/{n1}/{n2}")
    public float sum(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2
    ){
        return CalculatorModel.sum(Float.parseFloat(n1), Float.parseFloat(n2));
    }

}
