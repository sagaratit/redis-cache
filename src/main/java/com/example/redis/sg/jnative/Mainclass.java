package com.example.redis.sg.jnative;

import java.text.NumberFormat;

abstract class ABC {
    abstract void getDt();
    void getDate() {
        System.out.println("test");
    }
}

interface MyInt {
    void getNew();
    abstract void getVal();
    void myMethod();
}

public class Mainclass {

    public static void main(String[] args) {
        String $s_a="abc";
        System.out.println(NumberFormat.getNumberInstance());
        boolean b=false;
        System.out.println("boolean b-> "+b);
    }
}
