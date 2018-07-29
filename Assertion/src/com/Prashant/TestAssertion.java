package com.Prashant;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestAssertion {

    @Test
    public void testAssertion() {
        String str1 = new String("Prsnt");
        String str2 = new String("Prsnt");
        String str3 = null;
        String str4 = new String("Gaurav");
        String str5 = new String("Gaurav");

        int val1 = 7;
        int val2 = 5;

        String[] expectedArray = {"One", "Two", "Three"};
        String[] resultArray = {"One", "Two", "Three"};

        assertEquals(str1, str2);

        assertTrue(val1 > val2);

        assertFalse(val1 < val2);

        //assertSame(str1, str2);

        assertNotSame(str1, str5);

        assertArrayEquals(expectedArray, resultArray);

        assertNull(str3);
    }

}
