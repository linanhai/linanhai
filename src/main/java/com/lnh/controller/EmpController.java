package com.lnh.controller;

import com.lnh.bean.EmpBean;
import com.lnh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by linanhai on 2017/8/2.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        return "emp";
    }

    @RequestMapping(value = "/getEmp", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<EmpBean> getEmp(String condition) {
        try {
            return service.getEmp(condition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
