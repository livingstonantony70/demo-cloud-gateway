package com.example.democloudgateway.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gatewayhandler")
public class CustomController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String getName(@PathVariable("name") String name){
        return "your name is "+name;
    }
}
