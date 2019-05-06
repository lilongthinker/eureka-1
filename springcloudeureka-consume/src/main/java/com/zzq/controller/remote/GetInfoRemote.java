package com.zzq.controller.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "springcloud-produce")
public interface GetInfoRemote {

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name")String name);

}
