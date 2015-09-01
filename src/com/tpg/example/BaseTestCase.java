package com.tpg.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestCase {
	
	@BeforeClass
	public void name() {
		System.out.println("Inside before class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Inside after class");
	}

}
