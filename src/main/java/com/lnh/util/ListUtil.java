package com.lnh.util;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;

public class ListUtil {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("1,2,3", "a,b,c","d,e,f", "4,5,6");
        String str=StringUtils.join(strList.toArray(),",");
        System.out.println(str);

        List<String> newStrList = Arrays.asList(StringUtils.split(str,","));
        System.out.println(newStrList);
    }
}
