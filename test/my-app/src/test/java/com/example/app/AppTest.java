package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAddition()
    {
        assertTrue(5 + 4 == 9);
    }
    
    @Test
    public void testSubtraction()
    {
        System.out.println("Current time is: " + System.currentTimeMillis());
        assertTrue(5 - 4 == 1);
    }
}
