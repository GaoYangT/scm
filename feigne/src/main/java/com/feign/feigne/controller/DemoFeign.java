package com.feign.feigne.controller;

import com.feign.feigne.client.DemoFeignClient;
import com.feign.feigne.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoFeign {
    @Autowired
    private DemoFeignClient demoFeignClient;
    @RequestMapping("/Feign/{id}")
    @ResponseBody
    public User Demo(@PathVariable("id")int id){
        return demoFeignClient.pro(id);
    }

}
