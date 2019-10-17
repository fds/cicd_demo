package com.liss.serviceclient.fallback;

import com.liss.serviceclient.client.HiClient;
import org.springframework.stereotype.Component;

@Component
public class HiFallBack implements HiClient {

    @Override
    public String hi() {
        return "Wo,失败了";
    }
}
