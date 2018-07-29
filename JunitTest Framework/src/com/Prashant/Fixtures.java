package com.Prashant;

import junit.framework.TestCase;

public class Fixtures extends TestCase {
    protected int value1,value2;

    protected void setUp(){
        value1=3;
        value2=3;
    }

    public void testAdd(){
        double result=value1+value2;
        assertTrue(result==6);
    }


}
