package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hh")
public class DemoController {
    @GetMapping(value = "")
    public String ceshi(){
        return "sdsdsfdsfgsd";
    }

}

