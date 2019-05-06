package com.zzq.controller;

import com.zzq.controller.remote.GetInfoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetName {

    @Autowired
    private GetInfoRemote getInfoRemote;

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name")String name){
        return getInfoRemote.getName(name);
    }

}
