package com.feign.feigne.client;

import com.feign.feigne.model.User;
import org.springframework.stereotype.Component;


@Component
public class DemoFeginClientImpl implements DemoFeignClient{


    @Override
    public User pro(int id) {
        User user = new User();
        user.setUserName("调用失败");
        return user;
    }
}
