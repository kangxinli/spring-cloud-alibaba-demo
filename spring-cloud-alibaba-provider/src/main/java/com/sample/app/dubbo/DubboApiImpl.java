package com.sample.app.dubbo;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.sample.app.api.DubboApi;

@Service
public class DubboApiImpl implements DubboApi {

    @Value("${server.port}")
    private Integer port;

    @Override
    public String demo() {
        return "port= "+ port;
    }

}
