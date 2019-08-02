package com.wuligit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * create by zx Liu in 2019-08-02
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }
}
