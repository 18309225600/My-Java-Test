package com.lhf.javatest.jdk8.printobj;

import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author Pirate
 * @desc 打印测试类
 * @since v1.0.0
 **/
public class PrintObjTest {

    @Test
    public void testPrint(){
        PrintObj printObj = new PrintObj();
        System.out.println(ClassLayout.parseInstance(printObj).toPrintable());
    }
}
