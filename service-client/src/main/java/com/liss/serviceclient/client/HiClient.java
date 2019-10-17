package com.liss.serviceclient.client;

import com.liss.serviceclient.fallback.HiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-hi",fallback = HiFallBack.class)
public interface HiClient {

    @GetMapping("/hi")
    String hi();

}