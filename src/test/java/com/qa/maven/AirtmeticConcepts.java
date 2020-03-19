package com.qa.maven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AirtmeticConcepts {
	
	@Test()
	public void sum(){
		System.out.println("print SUM");
		int a= 10;
		int b = 20;
		AssertJUnit.assertEquals(30, a+b);	
	}
	
	@Test()
	public void sub(){
		System.out.println("print SUB");
		int a= 10;
		int b = 20;
		AssertJUnit.assertEquals(10, b-a);	
	}
	
	@Test()
	public void mul(){
		System.out.println("print MUL");
		int a= 10;
		int b = 20;
		AssertJUnit.assertEquals(200, a*b);	
	}

}
