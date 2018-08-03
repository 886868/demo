package com.example.controller;

import com.example.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yueminrui on 2018/7/27.
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class ControllerTest {
    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/lucy")
    public String miya() {
        return configBean.getGreeting() + "-" + configBean.getName() + "-" + configBean.getUuid() + "-" + configBean.getMax();
    }
}
