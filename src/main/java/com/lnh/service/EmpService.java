package com.lnh.service;

/**
 * Created by linanhai on 2017/8/2.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnh.bean.EmpBean;
import com.lnh.mapper.EmpMapper;

@Service
public class EmpService {

    @Autowired
    private EmpMapper mapper;

    public List<EmpBean> getEmp(String condition) {
        return mapper.selectEmp(condition);
    }

}