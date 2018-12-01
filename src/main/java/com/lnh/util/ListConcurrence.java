package com.lnh.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListConcurrence extends Thread {

    public static final List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public void run() {
        Collections.shuffle(list);
        System.out.println(list);

    }

    public static void main(String[] args) {
        for(int i=0;i<100000;i++) {
            ListConcurrence thread = new ListConcurrence();
            thread.start();
        }
    }
}
