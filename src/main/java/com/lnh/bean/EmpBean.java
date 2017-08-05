package com.lnh.bean;

import java.io.Serializable;

/**
 * Created by linanhai on 2017/8/2.
 */
public class EmpBean implements Serializable{
    private static final long serialVersionUID = -2401221146115564171L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
