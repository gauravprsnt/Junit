package com.Prashant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {
    String message="Prashant";
    Message message1=new Message(message);

    @Test
    public void testSaluationMessage(){
        System.out.println("Inside messase Salutation::");
        message="Hi "+"Prashant";
        assertEquals(message,message1.salutationMessage());
    }
}
