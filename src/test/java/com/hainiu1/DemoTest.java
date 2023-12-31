package com.hainiu1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author
 * @description
 */
public class DemoTest {

    @Test
    public void test(){
        Demo1 demo1 = new Demo1();
        String niko = demo1.say("Niko");
        System.out.println(niko);
        Assert.assertEquals("This is Niko", niko);
    }

    @Before
    public void before(){
        System.out.println("Before operation!");
    }
    @After
    public void after(){
        System.out.println("After operation!");
    }
}
