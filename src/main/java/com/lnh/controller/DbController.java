package com.lnh.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getEmp")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from emp";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    //System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

    @RequestMapping("/emp/{id}")
    public String getEmpName(@PathVariable String id){
        String sql = "select name from emp where id=" + id;
        String name = "";
        Map<String,Object> map = null;
        map = jdbcTemplate.queryForMap(sql);
        if(map!=null) name = (String) map.get("name");
        return name;
    }

}

