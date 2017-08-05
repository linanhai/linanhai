package com.lnh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lnh.bean.EmpBean;
import com.lnh.service.EmpService;

/**
 * Created by linanhai on 2017/8/2.
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping("/getEmp")
    public List<EmpBean> getEmp(){

        return service.getEmp();
    }
}