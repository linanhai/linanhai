package com.lnh.controller;

import com.lnh.bean.EmpBean;
import com.lnh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by linanhai on 2017/8/2.
 */
@RestController
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() {

        return new ModelAndView("emp");
    }

    @RequestMapping(value = "/getEmp", method = {RequestMethod.POST, RequestMethod.GET})
    public List<EmpBean> getEmp(String condition) {

        try {
            return service.getEmp(condition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
