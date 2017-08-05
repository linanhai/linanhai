package com.lnh.controller;

import com.lnh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class PageController {

    @Autowired
    private EmpService service;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        return "hello";
    }


}