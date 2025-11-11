package com.nit.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
	
	@Test
	public void testWithPositive() {
//		create service class object
		Arithmetic ar=new Arithmetic();
		float expected=20.0f;
		float actual=ar.sum(10.0f,20.0f);
		float delta=10.0f;
//		perform testing
		assertEquals(expected,actual,delta);
	}
	
	@Test
	public void testWithNegative() {
		Arithmetic ar=new Arithmetic();
		float expected=-30.0f;
		float actual=ar.sum(-10.0f, -20.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZeros() {
		Arithmetic ar=new Arithmetic();
		float expected=0.0f;
		float actual=ar.sum(0.0f, 0.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	@Disabled
	public void testWithMixedValues() {
		Arithmetic ar=new Arithmetic();
		float expected=-10.0f;
		float actual=ar.sum(10.0f, -20.0f);
		assertEquals(expected,actual);
	}

}
