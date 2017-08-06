package com.lnh.mapper;
import com.lnh.bean.EmpBean;

import java.util.List;

/**
 * Created by linanhai on 2017/8/2.
 */
public interface EmpMapper {
    List<EmpBean> selectEmp(String condition);
}
