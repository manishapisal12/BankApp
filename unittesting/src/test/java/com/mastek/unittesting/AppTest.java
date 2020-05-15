package com.mastek.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testGetMessage() {
    	App app=new App();
    	assertEquals("Hello World", app.getMessage(),"Test Failed");
    	
    }
}
