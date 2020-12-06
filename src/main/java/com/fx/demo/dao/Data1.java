package com.fx.demo.dao;

import lombok.Data;

import java.util.HashMap;

/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  11:00 2020/12/6
 */
@Data
public class Data1 {
    private String name;
    private int age;
    private HashMap<String,String> hashMap;

    public Data1(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
