package com.hainiu1;

import org.junit.Assert;
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
}
