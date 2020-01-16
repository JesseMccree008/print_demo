package com.example.jlw.demo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jlw
 * @date 2020/1/15
 * @description
 */
@Controller
public class MyController {

    @RequestMapping("/printPart")
    public String hello(){
        return "part.html";
    }

    @RequestMapping("/printAll")
    public String printAll(){
        return "all.html";
    }
    @RequestMapping("/printAllDemo")
    public String printAllDemo(){
        return "all_demo.html";
    }
}
