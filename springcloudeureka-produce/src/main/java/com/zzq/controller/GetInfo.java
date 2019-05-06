package com.zzq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GetInfo {

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name")String name){

        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return name + (new Date().getTime());
    }

}
