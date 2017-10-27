package com.whh.confgclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Des Created by win10 on 2017/10/27.
 */

@RefreshScope
@RestController
public class ClientController {

    @Value("${from}")
    private String from;

    @Resource
    private Environment environment;

    @RequestMapping("/from")
    public String from(){
//        return environment.getProperty("from","undefined");
        return this.from;
    }
}
