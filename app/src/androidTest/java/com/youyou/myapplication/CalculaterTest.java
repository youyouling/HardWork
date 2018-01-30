package com.youyou.myapplication;

import org.junit.Assert;

import bean.Calculater;

/**
 * Created by yuemeiling on 2017/12/22.
 */

public class CalculaterTest {
    Calculater calculater = new Calculater();

    @org.junit.Test
    public void testAdd(){
        int a = 1;
        int b = 2;

        int result = calculater.add(a,b);
        Assert.assertEquals(result,4);//验证resulr == 3,如果不正确，测试不通过
    }

    @org.junit.Test
    public void testAdd2(){
        int a = 1;
        int b = 2;

        int result = calculater.add(a,b);

    }

}
