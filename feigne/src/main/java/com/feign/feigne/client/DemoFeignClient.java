package com.feign.feigne.client;

import com.feign.feigne.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@FeignClient(value = "son" ,fallback = DemoFeginClientImpl.class)
public interface DemoFeignClient {

    @RequestMapping("/pro/{id}")
    public User pro(@PathVariable(value = "id") int id);
}
