package com.mastek.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.mastek.unittesting.util.Calculator;

class SampleTest {

	private static  Calculator calculator;
	private int num1;
	private int num2;
	// 1.Before everything init
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforAll");
		calculator=new Calculator();
	}
	// 3. Before each test
	@BeforeEach
	void beforeEachTest() {
		System.out.println("BeforEach");
		num1=100;
		num2=111;
	}
	//5. write your test cases 
	@Test
	void testAddBothPositive() {
		System.out.println("testAddBothPositive");
		assertEquals(211,calculator.add(num1,num2));
	}
	@Test
	void testAddBothNegative() {
		System.out.println("testAddBothNegative");
		num1=num1*(-1);
		num2=num2*(-1);
		assertEquals(-211,calculator.add(num1,num2));
	}
	@Test
	void testAddMixMaxNegative() {
		System.out.println("testAddMixMaxNegative");
		num2=num2*(-1);
		assertEquals(-11,calculator.add(num1,num2));
	}
	@Disabled
	@Test
	void testAddMixMaxPositive() {
		System.out.println("testAddMixMaxPositive");
		num1=num1*-1;
		num2=num2;
		assertEquals(11,calculator.add(num1,num2));
	}

	
	
	// 4. after each test
	@AfterEach
	void afterEachTest() {
		System.out.println("afterEachTest");
		num1=0;
		num2=0;
	}
	// 2. after everything closure
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
		calculator=null;
	}
}
