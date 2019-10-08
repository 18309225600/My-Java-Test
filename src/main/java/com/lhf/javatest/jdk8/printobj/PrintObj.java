package com.lhf.javatest.jdk8.printobj;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pirate
 * @desc 打印的目标类
 * @since v1.0.0
 **/
public class PrintObj {

    private boolean b1 = false;
    private boolean b3 = false;
    private Boolean b2 = false;
    private String name = "abc";
    private boolean[] attach = new boolean[10];
    private Map map = new HashMap();
    private char c = 'c';

    public boolean isB1() {
        return b1;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public Boolean getB2() {
        return b2;
    }

    public void setB2(Boolean b2) {
        this.b2 = b2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getAttach() {
        return attach;
    }

    public void setAttach(boolean[] attach) {
        this.attach = attach;
    }
}
