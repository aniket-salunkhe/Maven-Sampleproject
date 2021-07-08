package com.FirstMavenProgram;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator c1 = new Calculator();

    @Test
    public void testAdd()
    { 
		
        assertEquals(30,c1.add(10,20));
    }


@Test
    public void testSub()
    {
        assertEquals(-10,c1.sub(10,20));
    }
	
	@Test
    public void testMultiply()
    {
        assertEquals(200,c1.multiply(10,20));
    }
	
	
	@Test
    public void testDivision()
    {
        assertEquals(0,c1.division(10,20));
    }

}
