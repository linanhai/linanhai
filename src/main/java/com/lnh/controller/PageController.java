package com.lnh.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class PageController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }


}