package com.hainiu2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author
 * @description
 */
public class Demo2Test {
    @Test
    public void test(){
        Demo2 demo2 = new Demo2();
        int sum = demo2.getSum();
        System.out.println(sum);
        Assert.assertEquals(5050,sum);
    }
}
