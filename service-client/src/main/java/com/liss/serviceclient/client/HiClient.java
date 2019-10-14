package com.liss.serviceclient.client;

import com.liss.serviceclient.fallback.HiFallBack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-hi",fallback = HiFallBack.class)
public interface HiClient {

    @GetMapping("/hi")
    String hi();

}