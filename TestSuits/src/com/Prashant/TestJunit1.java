package com.Prashant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {
    String message="Prashant";
    Message msg=new Message(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage");
        assertEquals(message, msg.printMessage());

    }
}
