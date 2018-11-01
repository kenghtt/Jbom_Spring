package com.jbom.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: Jbom
 * Package: com.jbom.demo.controller
 * <p>
 * User: jeremytouch
 * Date: 10/28/18
 * Time: 10:37 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController

public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Spring boot is working!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
